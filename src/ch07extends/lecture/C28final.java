package ch07extends.lecture;

public class C28final {
}

class MyClass28 {
    // final 메소드는 재정의할 수 없음
    final void method1() {
        System.out.println("어떤 메소드");
    }
}

class MySubClass28 extends MyClass28 {
//    void method1() {
//        // 재정의 할 수 없음
//    }
}







