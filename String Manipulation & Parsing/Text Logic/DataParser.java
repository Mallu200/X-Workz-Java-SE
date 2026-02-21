class DataParser {
    public static void main(String[] args) {
        String record = "Laptop,Electronics,50000,InStock";
        
        // Break the string everywhere there is a comma
        String[] details = record.split(",");
        
        System.out.println("Item Name: " + details[0]);
        System.out.println("Price: " + details[2]);
        System.out.println("Status: " + details[3]);
    }
}