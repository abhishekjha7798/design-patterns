package org.abhishekjha.structural.decorator.decoratorImpl;

import org.abhishekjha.structural.decorator.Sandwich;
import org.abhishekjha.structural.decorator.SandwichDecorator;

public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + Mayonnaise";
    }
}
