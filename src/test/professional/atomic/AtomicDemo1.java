package test.professional.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo1 {
    int val = 10;
    int x;

    AtomicDemo1(int i) {
        val = i;
    }

    private AtomicInteger value = new AtomicInteger(val);

    public static void main(String[] args) {
        AtomicDemo1 at = new AtomicDemo1(5);
        System.out.println(at.value.decrementAndGet());
    }
}
