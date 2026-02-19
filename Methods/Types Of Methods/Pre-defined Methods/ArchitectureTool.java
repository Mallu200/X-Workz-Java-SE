class ArchitectureTool {
    public static void main(String args[]) {
        System.out.println("Main started");

        double area = 64.0;
        
        // PRE-DEFINED METHOD: Math.sqrt(double a)
        // It takes a number and returns its square root as a double.
        // If the area is 64.0, side becomes 8.0 because 8.0 * 8.0 = 64.0.
        double side = Math.sqrt(area);
        
        System.out.println("Room Area: " + area + " sq meters");
        System.out.println("The side of the square room is: " + side + " meters");

        System.out.println("Main ended");
    }
}