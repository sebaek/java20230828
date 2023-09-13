package ch17stream.book.sec10;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        long count = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("count = " + count);

        int sum = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .sum();

        System.out.println("sum = " + sum);

        double avg = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);

        int max = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .min()
                .getAsInt();

        System.out.println("max = " + max);

        int min = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .min()
                .getAsInt();
        System.out.println("min = " + min);

        int first = Arrays.stream(arr)
                .filter(n -> n % 3 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("first = " + first);


    }
}
