package ch15collection.lecture;

import java.util.Set;

public class C17unmodifiable {
    public static void main(String[] args) {
        Set<String> set = Set.of("spring", "java", "html");
        System.out.println("set = " + set);

//        set.add("react");

        System.out.println("프로그램 실행 중....");
    }
}
