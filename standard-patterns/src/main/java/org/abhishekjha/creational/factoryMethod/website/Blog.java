package org.abhishekjha.creational.factoryMethod.website;

import org.abhishekjha.creational.factoryMethod.pages.AboutPage;
import org.abhishekjha.creational.factoryMethod.pages.CommentPage;
import org.abhishekjha.creational.factoryMethod.pages.ContactPage;
import org.abhishekjha.creational.factoryMethod.pages.PostPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
