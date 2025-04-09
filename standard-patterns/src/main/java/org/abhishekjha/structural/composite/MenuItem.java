package org.abhishekjha.structural.composite;

public class MenuItem extends MenuComponent {
    boolean vegetarian;
    double price;
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        builder.append(isVegetarian() ? "Vegetarian" : "Non-Vegetarian").append(", ");
        builder.append(getPrice()).append("\n");
        return builder.toString();
    }
}
