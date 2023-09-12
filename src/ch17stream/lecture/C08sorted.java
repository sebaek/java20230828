package ch17stream.lecture;

import java.util.List;

public class C08sorted {
    public static void main(String[] args) {
        var list = List.of(3, 1, 7, 4, 5, 10, 11, 0);
        list.stream()
                .sorted()
                .forEach(System.out::println);


    }
}
