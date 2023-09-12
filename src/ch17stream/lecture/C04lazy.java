package ch17stream.lecture;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class C04lazy {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        Stream<String> stream = list.stream();
        stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                System.out.println("중간 연산 실행중.....");
                return false;
            }
        })
                .count(); // 최종연산시 중간연산 실행됨

        System.out.println("프로그램 실행 중....");
    }
}
