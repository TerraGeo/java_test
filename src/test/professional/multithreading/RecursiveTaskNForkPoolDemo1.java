package test.professional.multithreading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class RecursiveTaskNForkPoolDemo1 {
    public static void main(String[] args) {
        int[] a = new int[15000];
        for (int i = 0; i < 15000; i++) {
            a[i] = 1;
        }
        System.out.println(Sum.sumArray(a));
    }
}

class Sum extends RecursiveTask<Long> {
    static final int MAX = 5000;
    int low;
    int high;
    int [] array;

    public Sum (final int low, final int high, final int[] array) {
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

    static long sumArray(int [] array) {
        ForkJoinPool fPool = new ForkJoinPool();
        return fPool.invoke(new Sum(0, array.length, array));
    }
}
