package ch08interface.lecture;

public class C12private {
}

interface MyInterface12 {
    default void method1() {
        // public instance 메소드
        someFeature();
        System.out.println("어떤 기능2");
    }

    default void method2() {
        // public instance 메소드
        someFeature();
        System.out.println("어떤 기능3");
    }

    private void someFeature() {
        // private instance 메소드
        System.out.println("어떤 기능1");
    }
}







