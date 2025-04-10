package org.abhishekjha.structural.proxy.imageProxy;

import java.util.HashMap;
import java.util.Map;

public class ImageProxy implements Image {
    private RealImage realImage;
    private final String filename;

    private static final Map<String, RealImage> imageCache = new HashMap<>();

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (imageCache.containsKey(filename)) {
            realImage = imageCache.get(filename);
        } else {
            realImage = new RealImage(filename);
            imageCache.put(filename, realImage);
        }
        realImage.display();
    }
}
