package test.sandbox.blocking_queue_demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo1 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new ArrayBlockingQueue(1);

        Producer producer = new Producer(queue);
        //Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        //new Thread(consumer).start();

        Thread.sleep(2000);
    }
}
