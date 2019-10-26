package test.professional.collectionsPro;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfListTwo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(60);
        list.removeIf(element -> element % 2 != 0);
        System.out.println(list);
    }
}
