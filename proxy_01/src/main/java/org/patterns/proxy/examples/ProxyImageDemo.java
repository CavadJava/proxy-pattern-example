package org.patterns.proxy.examples;

public class ProxyImageDemo {
    public static void main(String[] args) {
        String fileName = "proxy.jpg";
        Image image = new ProxyImage(fileName);
        image.display();
    }
}
