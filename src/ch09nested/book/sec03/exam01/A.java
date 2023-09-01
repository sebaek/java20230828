package ch09nested.book.sec03.exam01;

public class A {

    static class B {}

    B field1 = new B();

    static B field2 = new B();

    A() {
        B b = new B();
    }

    void method1() {
        B b = new B();
    }

    static void method2() {
        B b = new B();
    }
}
