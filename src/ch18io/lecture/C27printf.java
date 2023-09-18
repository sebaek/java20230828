package ch18io.lecture;

public class C27printf {
    public static void main(String[] args) {
        // width : 차지할 영역
        System.out.printf("@%1$s@%n", "java");
        System.out.printf("@%1$6s@%n", "java");
        System.out.printf("@%1$2s@%n", "java");

        // flag : 출력방법
        // - : 왼쪽정렬
        System.out.printf("@%1$6s@%n", "java");
        System.out.printf("@%1$-6s@%n", "java");

        // precision
        // 실수(f)와 같이쓰면 소숫점 이하 출력 갯수
        System.out.printf("%1$f%n", 3.141592);
        System.out.printf("%1$.3f%n", 3.141592);
        System.out.printf("%1$.1f%n", Math.PI);
        System.out.printf("%1$.0f%n", Math.PI);
    }
}
