package ch16lambda.lecture;

public class C10constructorReference {
    public static void main(String[] args) {
        MyInterface10 o1 = () -> {
            return new MyClass10();
        };

        MyInterface10 o2 = () -> new MyClass10();

        MyInterface10 o3 = MyClass10::new;

    }
}

class MyClass10 {
    MyClass10() {}
}

@FunctionalInterface
interface MyInterface10 {
    MyClass10 method();
}
