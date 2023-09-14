package ch11exceptioin.lecture;

public class C01exception {
    public static void main(String[] args) {
        System.out.println("실행코드1");
        System.out.println("실행코드2");

        int i = 0;
        int j = 3 / i; // ArithmeticException

        System.out.println("실행코드3");
    }
}
