package ch11exceptioin.lecture;

public class C05printStrackTrace {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("code3");
    }
}
