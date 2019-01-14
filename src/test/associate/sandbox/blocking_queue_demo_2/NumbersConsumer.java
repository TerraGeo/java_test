package test.associate.sandbox.blocking_queue_demo_2;

import java.util.concurrent.BlockingQueue;

public class NumbersConsumer implements Runnable {
    private BlockingQueue<Integer> queue;
    private final int positionPill;

    public NumbersConsumer(BlockingQueue<Integer> queue, int positionPill) {
        this.queue = queue;
        this.positionPill = positionPill;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer number = queue.take();
                if (number.equals(positionPill)) {
                    return;
                }
                System.out.println(Thread.currentThread().getName() + " result: " + number);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
