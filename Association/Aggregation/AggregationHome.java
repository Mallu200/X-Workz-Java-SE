class Cloth {
    String type;

    // --- STEP 1: INDEPENDENT ASSET ---
    // The cloth is created (manufactured) independently of any furniture.
    Cloth(String type) {
        this.type = type;
        // Mandatory SOP to trace the standalone object creation
        System.out.println(">> [TEXTILE-MILL] Item Manufactured: " + type);
    }
}

class Wardrobe {
    String material;
    
    // --- STEP 2: AGGREGATION (HAS-A) ---
    // The Wardrobe holds references to Cloth objects.
    // It doesn't create them; it only 'aggregates' them into a collection.
    Cloth[] clothes; 

    // Constructor: Linking existing clothes to the wardrobe
    Wardrobe(String material, Cloth[] items) {
        this.material = material;
        this.clothes = items;
        System.out.println(">> [HOME-SETUP] " + material + " Wardrobe is now storing " + items.length + " items.");
    }

    void listItems() {
        System.out.println("\n--- [INVENTORY: WARDROBE CONTENTS] ---");
        System.out.println("Furniture Material: " + this.material);
        
        // Safety Check: Verify the array link is valid
        if (clothes != null && clothes.length > 0) {
            for (Cloth c : clothes) {
                // Navigating to the aggregated object's data
                System.out.println(" -> Apparel Type: " + c.type);
            }
        } else {
            System.out.println(" -> Status: Wardrobe is empty.");
        }
        System.out.println("--------------------------------------\n");
    }
}

class AggregationHome {
    public static void main(String[] args) {
        System.out.println(">> [LOG] Starting Residential Inventory Trace...");

        // 1. Create the Child object independently
        // 'c1' exists in the Heap.
        Cloth c1 = new Cloth("Jacket");
        Cloth c2 = new Cloth("Denim Jeans");

        // 2. Create the Parent and "inject" the children via an array
        Wardrobe wood = new Wardrobe("Oak Wood", new Cloth[]{c1, c2});
        
        // 3. Utilize the aggregation link
        wood.listItems();

        // 4. WEAK LINK TEST: Destroy the Parent (Wardrobe)
        System.out.println(">> [ACTION] Removing the Wardrobe from the room...");
        wood = null; 

        // 5. Verification of Independence
        // The Wardrobe is gone, but the 'c1' (Jacket) is still accessible in main.
        System.out.println(">> [CHECK] Clothing Status: The " + c1.type + " still exists in the room.");
        
        System.out.println(">> [LOG] Aggregation verified: Children outlived the Parent.");
    }
}