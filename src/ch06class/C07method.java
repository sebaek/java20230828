package ch06class;

public class C07method {
    public static void main(String[] args) {
        MyClass07 o1 = new MyClass07();
        MyClass07 o2 = new MyClass07();

        o1.myMethod1();
        o2.myMethod1();

        // 줄맞춤 ctrl+alt+l
        o1.name = "java";
        o2.name = "spring";

        o1.printName();
        o2.printName();
    }
}

class MyClass07 {
    // field
    String name;

    // method
    void printName() {
        System.out.println("name = " + name);
    }

    void myMethod1() {
        System.out.println("myMethod1 실행됨");
    }
}
