package ch17stream.lecture;

import java.util.List;

public class C14map {
    public static void main(String[] args) {
        var list = List.of("java", "css", "react", "spring");

        list.stream()
                .map(x -> x.length())
                .forEach(System.out::println);
    }
}
