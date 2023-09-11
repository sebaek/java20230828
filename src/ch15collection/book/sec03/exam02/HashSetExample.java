package ch15collection.book.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        System.out.println("set.size() = " + set.size());
    }
}
