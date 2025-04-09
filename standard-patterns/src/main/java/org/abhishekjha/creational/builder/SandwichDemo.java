package org.abhishekjha.creational.builder;

public class SandwichDemo {
    public static void main(String[] args) {
        Sandwich.Builder builder = new Sandwich.Builder();
        builder.withBread("Wheat").withMeat("Chicken").withDressing("Mint Mayonnaise").withCondiments("Lettuce");
        Sandwich sandwich = builder.build();

        System.out.println(sandwich.getBread());
        System.out.println(sandwich.getMeat());
        System.out.println(sandwich.getDressing());
        System.out.println(sandwich.getCondiments());
    }
}
