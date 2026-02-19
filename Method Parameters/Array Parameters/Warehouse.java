class Warehouse {
    // Parameter 'categories' handles a bulk list of section codes
    static void checkInventory(char[] categories) {
        System.out.println("Method checkInventory started");
        
        for (char c : categories) {
            System.out.println("Scanning Section [" + c + "]... Status: OK");
        }
        
        System.out.println("Method checkInventory ended");
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        char[] sections = {'A', 'B', 'D', 'E'};
        checkInventory(sections);
        System.out.println("Main ended");
    }
}