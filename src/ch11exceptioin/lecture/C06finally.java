package ch11exceptioin.lecture;

public class C06finally {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch (ArithmeticException e) {
            System.out.println("code3");
        } finally {
            // finally block :
            // exception 발생과
            // 관계 없이 실행되는 block
            System.out.println("꼭 실행 코드!!");
        }

        System.out.println("code4");
    }
}
