package test.professional.collectionsPro;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapOne {
    public static void main(String[] args) {
        ConcurrentHashMap cmap = new ConcurrentHashMap();
        ConcurrentHashMap cmapTwo = new ConcurrentHashMap(10);
        ConcurrentHashMap cmapThree = new ConcurrentHashMap(10, 0.8f);
        ConcurrentHashMap cmapFour = new ConcurrentHashMap(100, 0.8f, 15);
        ConcurrentHashMap cmapFive = new ConcurrentHashMap(new HashMap());
    }
}
