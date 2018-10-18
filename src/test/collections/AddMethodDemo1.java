package test.collections;

import java.util.ArrayList;
import java.util.List;

public class AddMethodDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(3, "5");
        list.set(4, "F");
        System.out.println(list);
    }
}
