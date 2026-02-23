import java.util.*;

interface Shape { void draw(); }
class Circle implements Shape { public void draw() { System.out.println("Drawing Circle"); } }

public class GraphicsApp {
    public static void drawShapes(List<? extends Shape> shapes) {
        for (Shape s : shapes) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle());
        drawShapes(myCircles);
    }
}