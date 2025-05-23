package org.abhishekjha.structural.bridge.shapes.withBridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Square filled with color ");
        color.applyColor();
    }
}
