package test.professional.collectionsPro;

import java.util.ArrayDeque;

public class ArrayDequeOne {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        System.out.println(dq.element() + dq.poll());
        System.out.println(dq.poll());

    }
}
