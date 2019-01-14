package test.associate.sandbox.blocking_queue_demo_2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class NumberProducer implements Runnable{
    private BlockingQueue<Integer> numberQueue;
    private final int positionPill;
    private final int positionPillPerProducer;

    public NumberProducer(BlockingQueue<Integer> numberQueue, int positionPill, int positionPillPerProducer) {
        this.numberQueue = numberQueue;
        this.positionPill = positionPill;
        this.positionPillPerProducer = positionPillPerProducer;
    }

    @Override
    public void run() {
        try {
            generateNumbers();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void generateNumbers() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            numberQueue.put(ThreadLocalRandom.current().nextInt(100));
        }
        for (int j = 0; j < positionPillPerProducer; j++) {
            numberQueue.put(positionPill);
        }
    }
}
