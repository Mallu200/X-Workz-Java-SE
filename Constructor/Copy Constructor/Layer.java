class Layer {
    int opacity;
    String color;

    // Standard Constructor: To create a layer from scratch
    Layer(int o, String c) {
        this.opacity = o;
        this.color = c;
    }

    // Copy Constructor: To "Duplicate" an existing layer
    Layer(Layer existingLayer) {
        if(existingLayer != null) {
            // Cloning the properties
            this.opacity = existingLayer.opacity;
            this.color = existingLayer.color;
            System.out.println("New layer cloned from existing one.");
        }
    }
	
    void display() {
        System.out.println("Layer Info -> Opacity: " + opacity + "% | Color: " + color);
    }

    public static void main(String args[]) {
        System.out.println("Main method started");

        // Create the base layer
        Layer l1 = new Layer(80, "Blue");
        
        // Use the copy constructor to duplicate the layer settings
        Layer l2 = new Layer(l1);
		
        l1.display();
        l2.display();
        
        System.out.println("Main method ended");
    }
}