package ch06class;

public class C02class {
    public static void main(String[] args) {
        MyClass02 o1 = new MyClass02();
        o1.name = "spring";

        method1(o1);

        System.out.println("o1.name = " + o1.name); // spring? java?
    }

    public static void method1(MyClass02 p) {
        p.name = "java";
    }
}

class MyClass02 {
    String name;
}
