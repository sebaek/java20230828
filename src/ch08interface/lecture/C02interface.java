package ch08interface.lecture;

public class C02interface {
    public static void main(String[] args) {
        MyClass021 o1 = new MyClass021();
        MyInterface02 i2 = o1;

        System.out.println(System.identityHashCode(o1));
        System.out.println(System.identityHashCode(i2));

        MyInterface02 i3 = new MyClass021();

        System.out.println(System.identityHashCode(i3));

        i3.method1();
        i3.method2();

        MyInterface02 i4 = new MyClass022();
        i4.method1();
        i4.method2();

    }
}

class MyClass022 implements MyInterface02 {
    @Override
    public void method1() {
        System.out.println("MyClass022.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass022.method2");
    }
}

interface MyInterface02 {
    // 추상 메소드
    abstract public void method1();

    void method2(); // public, abstract
}

class MyClass021 implements MyInterface02 {
    @Override
    public void method1() {
        System.out.println("MyClass021.method1");
    }

    @Override
    public void method2() {
        System.out.println("MyClass021.method2");
    }
}







