package ch11exceptioin.lecture;

public class C19throws {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }

    public static void method1() throws ClassNotFoundException {
        System.out.println("code 1");
        method2();
        System.out.println("code 2");
    }

    public static void method2() throws ClassNotFoundException {
        method3();
    }

    public static void method3() throws ClassNotFoundException {}
}
