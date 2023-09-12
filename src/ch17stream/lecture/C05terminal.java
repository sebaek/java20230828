package ch17stream.lecture;

import java.util.List;

public class C05terminal {
    public static void main(String[] args) {
        List<String> list = List.of("css", "html", "spring");
        long count = list.stream()
                .count();

        System.out.println("count = " + count);
        System.out.println("list.size() = " + list.size());
    }
}
