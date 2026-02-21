class AgeCheck {
    public static void main(String[] args) {
        String inputAge = "25";
        
        int age = Integer.parseInt(inputAge);
        
        if (age >= 18) {
            System.out.println("Access Granted.");
        }
    }
}