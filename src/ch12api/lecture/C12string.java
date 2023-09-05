package ch12api.lecture;

public class C12string {
    public static void main(String[] args) {
        // length : 길이
        String a = "java";
        String b = "spring";
        String c = "hello world";
        String d = "hi java  ";

        System.out.println(a.length()); // 4
        System.out.println(b.length()); // 6
        System.out.println(c.length()); // 11
        System.out.println(d.length()); // 9

        // text block
        // 가장 왼쪽 들여쓰기 기준
        String e = """
               hello world
                hi java
                greeting spring
                """;
        System.out.println(e.length());



    }
}
