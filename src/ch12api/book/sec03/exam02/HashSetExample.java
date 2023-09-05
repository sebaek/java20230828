package ch12api.book.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "홍길동"));

        System.out.println(set.size());
    }
}
