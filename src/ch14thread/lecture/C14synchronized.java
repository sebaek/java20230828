package ch14thread.lecture;

public class C14synchronized {
    public static void main(String[] args) throws InterruptedException {
        MyBox14 box = new MyBox14(0);
        Thread t1 = new Thread(new Task14(box));
        Thread t2 = new Thread(new Task14(box));
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println("box.getValue() = " + box.getValue());
    }
}

class Task14 implements Runnable {
    private MyBox14 box;

    public Task14(MyBox14 box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            box.increment();
        }
    }
}

class MyBox14 {
    private int value;

    public MyBox14(int value) {
        this.value = value;
    }

    // synchronized method
    public synchronized void increment() {
        // monitor lock 은 this
        value++;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
