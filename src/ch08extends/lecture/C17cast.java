package ch08extends.lecture;

public class C17cast {

    public static void main(String[] args) {
        Animal17 ani1 = new Dog17();
        Animal17 ani2 = new Cat17();
//        ani1.bark(); // x

        if (ani1 instanceof Dog17) {
            Dog17 d1 = (Dog17) ani1; // 된다.
            d1.bark();
        } else {
            System.out.println("Dog로 형변환 안됨");
        }

        if (ani1 instanceof Cat17) { // false
            Cat17 c1 = (Cat17) ani1; // 안됨
            c1.meow();
        } else {
            System.out.println("Cat로 형변환 안됨");
        }

        if (ani2 instanceof Dog17) {
            Dog17 d2 = (Dog17) ani2; // 안됨
            d2.bark();
        } else {
            System.out.println("Dog로 형변환 안됨");
        }

        if (ani2 instanceof Cat17) {
            Cat17 c2 = (Cat17) ani2;
            c2.meow();
        } else {
            System.out.println("Cat로 형변환 안됨");
        }

        System.out.println("프로그램 종료....");
    }

}

class Animal17 {
}

class Dog17 extends Animal17 {
    public void bark() {
        System.out.println("멍멍!!!!");
    }
}

class Cat17 extends Animal17 {
    public void meow() {
        System.out.println("야옹~~~");
    }
}

