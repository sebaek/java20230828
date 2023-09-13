package ch17stream.lecture;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C19intStream {
    public static void main(String[] args) {
        // 최대값 구하기
        OptionalInt max = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33)
                .max();
        System.out.println("max = " + max.getAsInt());

        // 최소값 구하기
        OptionalInt min = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33)
                .min();
        System.out.println("min = " + min.getAsInt());

        // 평균 구하기
        OptionalDouble average = IntStream.of(9, 10, 0, 3, 1, 22, 77, 33)
                .average();
        System.out.println("average = " + average.getAsDouble());


    }
}
