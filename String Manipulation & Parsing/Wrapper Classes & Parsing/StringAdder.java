class StringAdder {
    public static void main(String[] args) {
        String num1 = "10";
        String num2 = "20";

        // Converting text to actual integers
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);

        System.out.println("Total: " + (a + b)); // Output: 30
    }
}