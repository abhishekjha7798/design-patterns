package org.abhishekjha.creational.factoryMethod.website;

import org.abhishekjha.creational.factoryMethod.pages.CartPage;
import org.abhishekjha.creational.factoryMethod.pages.ItemPage;
import org.abhishekjha.creational.factoryMethod.pages.SearchPage;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
