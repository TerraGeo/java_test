package test.professional.collectionsPro;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfList1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("and");
        list.add("an");
        list.add("animal");
        list.add("Ant");
        list.removeIf(e -> e.startsWith("an"));
        System.out.println(list);
    }
}
