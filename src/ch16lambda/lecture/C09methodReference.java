package ch16lambda.lecture;

public class C09methodReference {
    public static void main(String[] args) {
        MyInterface09 o1 = (x, y) -> {};


        MyClass09 o2 = new MyClass09();

        MyInterface09 o3 = (x, y) -> x.someMethod(y);
        MyInterface09 o5 = MyClass09::someMethod;
        MyInterface09 o4 = new MyInterface09() {
            @Override
            public void method(MyClass09 myClass09, int a) {
                myClass09.someMethod(a);
            }
        };
    }
}

class MyClass09 {
    void someMethod(int a) {

    }
}

interface MyInterface09 {
    void method(MyClass09 x, int y);
}