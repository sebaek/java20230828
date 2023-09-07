package ch13generic.lecture;

public class C11typeParameter {
    public static void main(String[] args) {
        MyClass11<Animal> o1 = new MyClass11<Animal>();
        MyClass11<Dog> o2 = new MyClass11<Dog>();
        MyClass11<Cat> o3 = new MyClass11<Cat>();

    }
}

class MyClass11<T extends Animal> {
    public void method(T param) {
        param.equals(null);
        param.toString();
        param.hashCode();
        param.animalMethod();
    }
}
