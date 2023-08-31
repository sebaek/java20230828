package ch07extends.book.sec06.package2;

import ch07extends.book.sec06.package1.A;

public class D extends A {
    private A a;

    public D() {
        super();
    }

    public void method1() {
        this.field = "value";
        this.method();
    }

    public void method2() {
//        A a = new A();
//        a.field = "value";
//        a.method();
    }

}
