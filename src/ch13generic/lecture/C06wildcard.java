package ch13generic.lecture;

import ch07extends.book.sec06.package2.D;

public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
//        MyClass06<Animal> o2 = o1; //?
//        o2.set(new Animal());

        MyClass06<? extends Animal> o3 = o1;
        MyClass06<? extends Animal> o6 = new MyClass06<Animal>();
        MyClass06<? extends Animal> o7 = new MyClass06<Dog>();
        MyClass06<? extends Animal> o8 = new MyClass06<Cat>();
//        MyClass06<? extends Animal> o9 = new MyClass06<Object>(); // x
        Animal ani1 = o3.get(); // 안전 (in)
//        o3.set(new Dog());// 안전 하지 않음
//        o6.set(new Cat());
//        o7.set(new Dog());
        ani1.animalMethod(); // 안전하게 사용하기 위함

        MyClass06<? super Animal> o4 = new MyClass06<Animal>();
        MyClass06<? super Animal> o5 = new MyClass06<Object>();
//        MyClass06<? super Animal> o10 = new MyClass06<Dog>(); // x
//        Animal aa = o5.get(); // x
        o4.set(new Dog()); // out
        o5.set(new Dog());
        o4.set(new Cat());
        o4.set(new Animal());
    }
}

class Animal {
    public void animalMethod() {}
}
class Dog extends Animal {}
class Cat extends Animal {}

class MyClass06<T> {
    public void set(T param) {}
    public T get() {
        return null;
    }
}
