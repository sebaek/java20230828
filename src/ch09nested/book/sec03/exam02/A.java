package ch09nested.book.sec03.exam02;

public class A {
    static class B {
        // 필드
        int field1 = 1;
        static int field2 = 2;

        // 생성자
        B() {
            System.out.println("B.B");
        }

        // 메소드
        void method1() {
            System.out.println("B.method1");
        }
        static void method2() {
            System.out.println("B.method2");
        }
    }
}
