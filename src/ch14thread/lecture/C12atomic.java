package ch14thread.lecture;

import java.util.concurrent.atomic.AtomicInteger;

public class C12atomic {
    private static AtomicInteger value = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                value.getAndIncrement();
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                value.getAndIncrement();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        System.out.println("value = " + value);
    }
}
