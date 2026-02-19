class Geometry {
    // Version 1: One int parameter
    // Logic: Calculates Area of Square (side * side)
    void area(int side) {
        System.out.println("Method area(int) started");
        
        System.out.println("Square Area: " + (side * side));
        
        System.out.println("Method area(int) ended");
    }

    // Version 2: Two int parameters
    // Overloading: Same name, but accepts length and breadth for a Rectangle
    void area(int l, int b) {
        System.out.println("Method area(int, int) started");
        
        System.out.println("Rectangle Area: " + (l * b));
        
        System.out.println("Method area(int, int) ended");
    }

    public static void main(String args[]) {
        System.out.println("Main method started");
        
        Geometry g = new Geometry();
        
        // Java calls the first version (Square)
        g.area(5);
        
        System.out.println("--------------------");
        
        // Java calls the second version (Rectangle)
        g.area(10, 20);
        
        System.out.println("Main method ended");
    }
}