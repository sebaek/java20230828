package ch15collection.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C09iterator {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("spring");
        set.add("css");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("item = " + item);
            iterator.remove();
        }

        System.out.println("set.size() = " + set.size());

        /*
        for (String elem : set) {
            // 반복문 사용중 collection 의 아이템 삭제시
            // exception 발생 할 수 있음
            System.out.println("elem = " + elem);
            if (elem.equals("css")) {
                set.remove("css");
            }
        }

         */
    }
}
