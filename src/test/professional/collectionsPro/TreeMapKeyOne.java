package test.professional.collectionsPro;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapKeyOne {
    public static void main(String[] args) {
        /*TreeMap<KeyOne, Integer> treeMap = new TreeMap<>();
        treeMap.put(new KeyOne(), 1);
        treeMap.put(new KeyOne(), 2);
        treeMap.put(new KeyOne(), 2);
        System.out.println(treeMap.values());*/

        TreeMap<KeyTwo, Integer> treeMapTwo = new TreeMap<>();
        treeMapTwo.put(new KeyTwo(), 1);
        treeMapTwo.put(new KeyTwo(), 2);
        treeMapTwo.put(new KeyTwo(), 2);
        System.out.println(treeMapTwo.values());
        System.out.println(new KeyTwo().equals(new KeyTwo()));
        System.out.println(new KeyTwo().compareTo(new KeyTwo()));

        HashMap<Object, Integer> objectIntegerHashMap = new HashMap<>();
        objectIntegerHashMap.put(new Object(), 1);
        objectIntegerHashMap.put(new Object(), 1);
        objectIntegerHashMap.put(new Object(), 2);
        System.out.println(objectIntegerHashMap.values());

        TreeMap<Object, Integer> objectIntegerTreeMap = new TreeMap<>();
        objectIntegerTreeMap.put(new Object(), 1);
        objectIntegerTreeMap.put(new Object(), 1);
        objectIntegerTreeMap.put(new Object(), 2);
    }

    static class KeyOne {}

    static class KeyTwo implements Comparable<KeyTwo> {

        @Override
        public int compareTo(@NotNull TreeMapKeyOne.KeyTwo o) {
            if (this.equals(o)) {
                return 0;
            }
            return -1;
        }
    }
}
