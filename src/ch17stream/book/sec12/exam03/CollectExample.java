package ch17stream.book.sec12.exam03;

import ch17stream.book.sec12.exam01.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("홍길동", "남", 92),
                new Student("김수영", "여", 87),
                new Student("감자바", "남", 95),
                new Student("오해영", "여", 93)
        );

        Map<String, Double> map = list.stream()
                .collect(Collectors.groupingBy(
                        s -> s.getSex(),
                        Collectors.averagingDouble(s -> s.getScore())
                ));

        System.out.println("map = " + map);
    }
}
