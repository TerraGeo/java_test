package test.professional.multithreading;

public class ThreadOrder1 implements Runnable{
    public static void main(String[] args) {
        ThreadOrder1 a1 = new ThreadOrder1();
        Thread t = new Thread(a1);
        t.setName("a1");
        t.start();
        System.out.println(Thread.currentThread().getName() + " ");
        try {
            t.join();
        } catch (InterruptedException e) {}

        System.out.println(Thread.currentThread().getName());

    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " ");
    }
}
