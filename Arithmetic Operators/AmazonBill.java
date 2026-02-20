class AmazonBill {
    public static void main(String[] args) {
        int laptopPrice = 50000;
        int mousePrice = 1200;
        int quantity = 2;

        int total = laptopPrice + (mousePrice * quantity);

        System.out.println("Item Total: " + total); // 52400
    }
}