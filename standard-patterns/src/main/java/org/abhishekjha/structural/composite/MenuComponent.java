package org.abhishekjha.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    String name;
    String description;

    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract String toString();

    public String print(MenuComponent menuComponent) {
        StringBuilder builder = new StringBuilder();
        builder.append(menuComponent.getName()).append(", ");
        builder.append(menuComponent.getDescription());
        if (menuComponent instanceof Menu) {
            builder.append("\n");
        } else if (menuComponent instanceof MenuItem) {
            builder.append(", ");
        }
        return builder.toString();
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Cannot add to a leaf");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Cannot remove from a leaf");
    }
}
