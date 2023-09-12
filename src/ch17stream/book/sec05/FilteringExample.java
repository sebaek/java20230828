package ch17stream.book.sec05;

import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        var list = List.of("홍길동", "신용권", "감자바",
                "신용권", "신민철");

        System.out.println("중복 제거 후 출력");
        list.stream()
                .distinct()
                .forEach(x -> System.out.println(x));
        System.out.println();

        System.out.println("'신'으로 시작하는 요소만 출력");
        list.stream()
                .filter(s -> s.startsWith("신"))
                .forEach(System.out::println);

        System.out.println("중복 없이 '신'으로 시작하는 요소만 출력");
        list.stream()
                .filter(n -> n.startsWith("신"))
                .distinct()
                .forEach(System.out::println);

    }
}
