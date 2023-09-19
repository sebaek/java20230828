package ch15collection.book.sec02.exam02;

import ch15collection.book.sec02.exam01.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) throws InterruptedException {
//        List<Board> list = new ArrayList<>();
        List<Board> list = new Vector<>();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(new Board("", "", ""));
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    list.add(new Board("", "", ""));
                }
            }
        };
        
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("list.size() = " + list.size());
        
    }
}
