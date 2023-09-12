package ch17stream.lecture;

import java.util.List;

public class C09limit {
    public static void main(String[] args) {
        var list = List.of(3, 9, 10, 11, 1, 0, -3);
        list.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("가장 작은 값 3개 출력하기");

        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("앞에 3개를 정렬해서 출력");
        list.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}
