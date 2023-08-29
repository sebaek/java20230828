package ch08extends.lecture;

public class C02extends {
    public static void main(String[] args) {
        MySubClass021 o1 = new MySubClass021();
        o1.name = "spring";
        o1.method3();
    }
}

// 위 코드에 문법오류가 없도록 MyClass02를 작성
class MyClass02 {
    String name;
    void method3() {
        System.out.println("MyClass02.method3");
    }
}

class MySubClass021 extends MyClass02 {

}

// MyClass02 : 상위 클래스, 부모 클래스, Super class
// MySubClass021 : 하위 클래스, 자식 클래스, Sub class





