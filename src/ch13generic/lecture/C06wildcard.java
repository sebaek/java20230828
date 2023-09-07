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
        Animal ani1 = o3.get(); // 안전
//        o3.set(new Dog());// 안전 하지 않음
        ani1.animalMethod();

        
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
