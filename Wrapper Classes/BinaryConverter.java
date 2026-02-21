class BinaryConverter {
    public static void main(String[] args) {
        int number = 15;
        
        // Using Integer wrapper to convert to Binary/Hex
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary of 15: " + binary); // 1111
    }
}