package test.associate.collections;

import java.util.ArrayList;
import java.util.List;

public class ListSetDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.set(3, "3"));
    }
}
