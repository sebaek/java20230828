package ch18io.lecture;

public class C25printf {
    public static void main(String[] args) {
        System.out.printf("출력할 문자들");
        System.out.printf("출력할 문자들2", "java", 3, 3.14);

        // %n : new line
        System.out.printf("출력할 문자들3%n다음줄 출력됨");
        System.out.printf("출력..%n");
        System.out.printf("%n출력@@@");

        // %% : %(percent)
        System.out.printf("%n%%:퍼센트");



    }

}
