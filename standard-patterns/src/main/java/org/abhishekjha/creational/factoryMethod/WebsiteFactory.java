package org.abhishekjha.creational.factoryMethod;

import org.abhishekjha.creational.factoryMethod.website.Blog;
import org.abhishekjha.creational.factoryMethod.website.Shop;
import org.abhishekjha.creational.factoryMethod.website.Website;

import org.abhishekjha.creational.factoryMethod.enums.WebsiteType;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        return switch (siteType) {
            case BLOG -> new Blog();
            case SHOP -> new Shop();
            default -> null;
        };
    }
}
