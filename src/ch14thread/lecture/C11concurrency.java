package ch14thread.lecture;

public class C11concurrency {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("t1!!!!!!!");
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("t2@@@@@@@");
            }
        });
        t2.start();

    }
}
