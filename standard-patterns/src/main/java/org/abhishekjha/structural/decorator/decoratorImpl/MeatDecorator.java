package org.abhishekjha.structural.decorator.decoratorImpl;

import org.abhishekjha.structural.decorator.Sandwich;
import org.abhishekjha.structural.decorator.SandwichDecorator;

public class MeatDecorator extends SandwichDecorator {
    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + Turkey";
    }
}
