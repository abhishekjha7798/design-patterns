package org.abhishekjha.structural.bridge.shapes.withoutBridge;

public class WithoutBridgeDemo {
    public static void main(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();

        // If we want to add a new shape, we need to create a new class for each color
        // and shape combination, leading to a combinatorial explosion of classes.
        // For example, if we want to add a GreenSquare, we need to create a new class:

        Square greenSquare = new GreenSquare();
        greenSquare.applyColor();
    }
}
