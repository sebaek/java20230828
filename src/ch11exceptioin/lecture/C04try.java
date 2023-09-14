package ch11exceptioin.lecture;

public class C04try {
    public static void main(String[] args) {
        System.out.println("code1");
        System.out.println("code2");

        try {
            int i = 3;
            int j = 3 / i;
            System.out.println("code3");
            System.out.println("code4");
        } catch (ArithmeticException e) {
            System.out.println("exception code1");
            System.out.println("exception code2");
        }

        System.out.println("code5");
    }
}
