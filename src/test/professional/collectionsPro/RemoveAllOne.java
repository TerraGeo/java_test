package test.professional.collectionsPro;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.removeIf(i -> i > 1);
        //list.removeAll(i -> i > 0);
    }
}
