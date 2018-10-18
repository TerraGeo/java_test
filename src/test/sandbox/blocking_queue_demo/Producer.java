package test.sandbox.blocking_queue_demo;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("1");
            Thread.sleep(500);
            System.out.println(queue);
            queue.offer("2", 500, TimeUnit.MILLISECONDS);
            Thread.sleep(500);
            queue.put("3");
            System.out.println(queue);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getCause());
        }
    }
}
