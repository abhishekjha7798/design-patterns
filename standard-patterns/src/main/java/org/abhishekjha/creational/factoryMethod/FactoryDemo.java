package org.abhishekjha.creational.factoryMethod;

import org.abhishekjha.creational.factoryMethod.enums.WebsiteType;
import org.abhishekjha.creational.factoryMethod.website.Website;

public class FactoryDemo {
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        assert blog != null;
        System.out.println(blog.getPages());

        Website shop = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        assert shop != null;
        System.out.println(shop.getPages());
    }
}
