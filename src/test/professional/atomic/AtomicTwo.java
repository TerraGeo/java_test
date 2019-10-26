package test.professional.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTwo {

    private static class CStore implements Runnable {
        int x = 1;
        private AtomicInteger cps = new AtomicInteger(10);

        public void run() {
            while (x > 0) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }

                synchronized (this) {
                    x = cps.decrementAndGet();
                }
                System.out.println(cps);
            }
        }
    }

    private static class CStoreTwo implements Runnable {
        int x = 1;
        private AtomicInteger cps = new AtomicInteger(10);

        public void run() {
            boolean moreThanZero = false;
            synchronized (this) {
                moreThanZero = x > 0;
            }
            while (moreThanZero) {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }

                    x = cps.decrementAndGet();
                System.out.println(cps);
            }
        }
    }

    public static void main(String[] args) {
        CStore cs = new CStore();

        Thread threadOne = new Thread(cs);
        Thread threadTwo = new Thread(cs);

        threadOne.start();
        threadTwo.start();

        /*CStoreTwo csTwo = new CStoreTwo();

        Thread csThreadOne = new Thread(csTwo);
        Thread csThreadTwo = new Thread(csTwo);

        csThreadOne.start();
        csThreadTwo.start();*/
    }
}
