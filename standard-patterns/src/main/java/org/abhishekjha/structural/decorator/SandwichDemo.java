package org.abhishekjha.structural.decorator;

import org.abhishekjha.structural.decorator.decoratorImpl.DressingDecorator;
import org.abhishekjha.structural.decorator.decoratorImpl.MeatDecorator;

public class SandwichDemo {
    public static void main(String[] args) {
        // The decorator pattern is a structural pattern that allows behavior to be added to individual
        // objects, either statically or dynamically, without affecting the behavior of other objects
        // from the same class. It is a flexible alternative to subclassing for extending functionality.
        // The decorator pattern is typically used to add responsibilities to individual objects
        // dynamically and is a good fit for the following scenarios:
        // 1. When you want to add responsibilities to individual objects, not to an entire class.
        // 2. When extension by subclassing is impractical. For example, if the class definition is
        //    hidden, or you want to add responsibilities to classes in a library.
        // 3. When you want to add responsibilities to classes at runtime.
        // 5. When you want to avoid class explosion, which can occur when using subclassing to add
        //    functionality to classes. The decorator pattern allows you to add functionality to classes
        //    without creating a large number of subclasses.
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
