package ch09nested.lecture;

public class C11interface {
    public static void main(String[] args) {
//        MyInterface11 o1 = new MyInterface11();
        MyInterface11 o2 = new MyClass111();
        MyInterface11 o3 = new MyInterface11() {
        };
    }
}


class MyClass111 implements MyInterface11 {}

interface MyInterface11 {}
