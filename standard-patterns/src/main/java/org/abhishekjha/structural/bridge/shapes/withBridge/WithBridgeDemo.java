package org.abhishekjha.structural.bridge.shapes.withBridge;

public class WithBridgeDemo {
    public static void main(String[] args) {
        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red  = new Red();
        Shape circle = new Circle(red);


        square.applyColor();
        circle.applyColor();

        // Now, if we want to add a new shape, we can do so without creating a new class for each color
        // and shape combination. We can simply create a new class that extends Shape and uses the existing Color classes.

        // For example, if we want to add a GreenSquare, we can do so like this:
        Color green = new Green();
        Shape greenSquare = new Square(green);

        greenSquare.applyColor();

    }
}
