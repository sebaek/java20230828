package ch08extends.lecture;

public class C09polymorphism {
    public static void main(String[] args) {
        MySubClass091 o1 = new MySubClass091();
        MyClass09 o2 = o1; // ok

//        String o3 = o1; // not ok
//        MyClass08 o4 = o1; // not ok

        MyClass09 o3 = new MyClass09();
//        MySubClass091 o4 = o3; // not ok
    }
}

class MyClass09 {

}

class MySubClass091 extends MyClass09 {

}
