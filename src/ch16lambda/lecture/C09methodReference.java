package ch16lambda.lecture;

public class C09methodReference {
    public static void main(String[] args) {
        MyInterface09 o1 = (x, y) -> {};


        MyClass09 o2 = new MyClass09();

        MyInterface09 o3 = (x, y) -> x.someMethod(y);
        MyInterface09 o4 = MyClass09::someMethod;
    }
}

class MyClass09 {
    void someMethod(int a) {

    }
}

interface MyInterface09 {
    void method(MyClass09 x, int y);
}