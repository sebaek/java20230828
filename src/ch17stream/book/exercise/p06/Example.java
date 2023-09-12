package ch17stream.book.exercise.p06;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        var list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        list.stream()
                .map(m -> m.getAge())
                .forEach(System.out::println);
    }
}
