package ch08interface.lecture;

public class C15exercise {
    MyInterface15 field;

    public static void main(String[] args) {
        C15exercise o1 = new C15exercise();
        // 확인문제 3 - 보기 1
        o1.field = new MyClass151();
        o1.field = new MyClass152();

        // 확인문제 3 - 보기2
        method(new MyClass152());
        method(new MyClass151());

        // 확인문제 3 - 보기3
        MyInterface15[] arr = new MyInterface15[3];
        arr[0] = new MyClass151();
        arr[1] = new MyClass152();

    }

    public static void method(MyInterface15 param) {

    }
}

interface MyInterface15 {}
class MyClass151 implements MyInterface15 {}
class MyClass152 implements MyInterface15 {}
