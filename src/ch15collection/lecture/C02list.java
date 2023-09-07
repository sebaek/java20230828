package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C02list {
    public static void main(String[] args) {
        // List : 순서가 있음, 중복된 원소 저장 가능
        List<String> list = new ArrayList<>();

        // element 추가
        list.add("java");
        list.add("spring");
        list.add("css");
        list.add("react");

        // element 꺼내기
        String s = list.get(0);
        String s1 = list.get(3);
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        // 몇 개의 원소가 있는지?
        int size = list.size();
        System.out.println("size = " + size);

        list.add("react");
        list.add("css");

        System.out.println(list.size());

        // 지우기
        list.remove("react");
        System.out.println(list.size());
        list.remove("java");
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(3));

        // 있는 지 확인
        boolean contains = list.contains("java");
        boolean contains1 = list.contains("react");
        System.out.println("contains = " + contains);
        System.out.println("contains1 = " + contains1);

        // 전체 원소 탐색 (for)
        System.out.println("for문 사용 전체 탐색");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("향상된 for문 사용 전체 탐색");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("foreach 메소드로 전체 탐색");
//        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
}
