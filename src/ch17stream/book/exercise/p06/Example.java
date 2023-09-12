package ch17stream.book.exercise.p06;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        var list = List.of(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

        //
        System.out.println("나이들만 출력");
        list.stream()
                .map(m -> m.getAge())
                .forEach(System.out::println);

        //
        System.out.println("나이들의 합 reduce로 구해서 출력");
        // stream, map, reduce
        // sout
        Integer sum = list.stream()
                .map(m -> m.getAge())
                .reduce(0, Integer::sum);
        System.out.println("sum = " + sum);

        //
        System.out.println("가장 많은 나이 reduce로 구해서 출력");

        //
        System.out.println("가장 작은 나이 reduce로 구해서 출력");
        


    }
}
