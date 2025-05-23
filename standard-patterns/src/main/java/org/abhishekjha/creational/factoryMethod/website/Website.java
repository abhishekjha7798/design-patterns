package org.abhishekjha.creational.factoryMethod.website;

import org.abhishekjha.creational.factoryMethod.pages.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void createWebsite();
}
