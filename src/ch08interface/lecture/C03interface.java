package ch08interface.lecture;

public class C03interface {
    public static void main(String[] args) {
        MyClass03 o1 = new MyClass03();
        o1.method1();
        o1.method2();

        MyInterface031 i1 = o1;
        MyInterface032 i2 = o1;

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));

        i1.method1();
//        i1.method2();

//        i2.method1();
        i2.method2();
    }
}

interface MyInterface031 {
    void method1();
}
interface MyInterface032 {
    void method2();
}

// 여러 인터페이스를 구현할 수 있다.
class MyClass03 implements MyInterface031, MyInterface032  {
    @Override
    public void method1() {
        System.out.println("MyClass03.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass03.method2");
    }
}

