package test.professional.multithreading;

import java.util.concurrent.RecursiveTask;

public class RecursiveTaskDemo1 extends RecursiveTask<Long> /*RecursiveAction */{
    static final int MAX = 50000;
    int low;
    int high;
    int [] array;

    public RecursiveTaskDemo1(final int low, final int high, final int[] array) {
        this.low = low;
        this.high = high;
        this.array = array;
    }

    @Override
    protected Long compute() {
        if (high - low <= MAX) {
            long sum = 0;
            for (int i = low; i < high; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            int mid = low + (high - low) / 2;
            RecursiveTaskDemo1 leftSum = new RecursiveTaskDemo1(low, mid, array);
            RecursiveTaskDemo1 rightSum = new RecursiveTaskDemo1(mid, high, array);
            long rightAns = rightSum.compute();
            leftSum.fork();
            long leftAns = leftSum.join();
            return rightAns + leftAns;
        }
    }

    public static void main(String[] args) {
        RecursiveTaskDemo1 demo = new RecursiveTaskDemo1(0, 4, new int[]{45, 32, 12, 19,});
        System.out.println(demo.compute());
    }
}
