package ch09nested.book.sec02.exam01;

public class A {
    class B {}

    B field = new B();

    A() {
        B b = new B();
    }

    void method() {
        B b = new B();
    }
}
