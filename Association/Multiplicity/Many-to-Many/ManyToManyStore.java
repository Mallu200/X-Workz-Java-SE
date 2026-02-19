class Product {
    String pName;

    // --- STEP 1: CONSTRUCTOR ---
    // Products are created as independent inventory items in the warehouse.
    Product(String name) {
        this.pName = name;
        // Mandatory SOP to track inventory entry
        System.out.println(">> [WAREHOUSE-DB] Inventory Added: " + name);
    }
}

class ShoppingCart {
    String customerName;
    
    // --- STEP 2: THE MANY-TO-MANY LINK ---
    // The ShoppingCart 'has-a' reference to an array of Products.
    // Multiple carts can point to the same Product objects (Global Inventory).
    Product[] items;

    // Constructor: Linking the Cart to the selected Products (Dependency Injection)
    ShoppingCart(String name, Product[] items) {
        this.customerName = name;
        
        // Storing the array of product references into the cart
        this.items = items;
        System.out.println(">> [CHECKOUT-LOG] Customer '" + name + "' initialized cart with " + items.length + " items.");
    }

    void generateBill() {
        System.out.println("\n--- [RETAIL INVOICE / RECEIPT] ---");
        System.out.println("Customer Name : " + this.customerName);
        
        // Safety Check: Verify the cart is not empty before billing
        if (items != null && items.length > 0) {
            System.out.println("Purchased Items:");
            
            // TRAVERSING THE ASSOCIATION:
            // We loop through the 'items' array to access the data inside each Product object
            for (Product p : items) {
                System.out.println("  - " + p.pName);
            }
        } else {
            System.out.println("  - Cart is currently empty.");
        }
        
        System.out.println("Status        : PAYMENT SUCCESSFUL");
        System.out.println("----------------------------------\n");
    }
}

class ManyToManyStore {
    public static void main(String[] args) {
        System.out.println(">> [SYSTEM] Opening E-Commerce Portal...");

        // 1. Create the 'Many' (Products) as independent inventory objects
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Mouse");
        Product p3 = new Product("Keyboard");

        // 2. Define the 'Many' set for Rahul's specific transaction
        // Rahul chooses the Laptop and the Mouse
        Product[] rahulCart = {p1, p2};

        // 3. Create the ShoppingCart and associate the products with it
        ShoppingCart cart = new ShoppingCart("Rahul", rahulCart);

        // 4. Utilize the association to generate the final bill
        cart.generateBill();

        System.out.println(">> [SYSTEM] Transaction Logged. Portal Idle.");
    }
}