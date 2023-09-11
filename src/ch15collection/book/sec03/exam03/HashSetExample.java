package ch15collection.book.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("java");
        set.add("jdbc");
        set.add("jsp");
        set.add("spring");

        Iterator<String> iterator = set.iterator();

//        String next = iterator.next();
//        System.out.println("next = " + next);
//        String next1 = iterator.next();
//        System.out.println("next1 = " + next1);
//        String next2 = iterator.next();
//        System.out.println("next2 = " + next2);
//        String next3 = iterator.next();
//        System.out.println("next3 = " + next3);

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }

        for (String elem : set) {
            System.out.println("elem = " + elem);
        }


    }
}
