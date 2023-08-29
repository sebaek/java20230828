package ch06class;

public class C09static {
}

class MyClass09 {
    String name; // instance field
    static String model; // static field

    // instance method
    void printName() {
        // instance member끼리 접근 가능
        System.out.println("name = " + name);

        // instance member에서 static member 접근 가능
        System.out.println("model = " + model);
    }
    
    // static method
    static void printModel() {
        // static member끼리 접근 가능
        System.out.println("model = " + model);
        
        // static member에서 instance member는 접근 불가능
//        System.out.println("name = " + name);
    }
}













