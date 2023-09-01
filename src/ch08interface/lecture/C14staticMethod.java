package ch08interface.lecture;

public class C14staticMethod {
    public static void main(String[] args) {
        MyInterface14.method(); // public static 메소드 실행
        MyInterface14.method2();

//        MyInterface14.common();
    }
}

interface MyInterface14 {
    // 필드 : public static final

    // 인스턴스 메소드 :
    //  추상메소드
    //  default 메소드
    //  private 메소드

    // static(정적) 메소드
    //   public static 메소드
    //   private static 메소드

    static void method() {
        // public static 메소드
        System.out.println("MyInterface14.method");
        common();
    }

    static void method2() {
        System.out.println("MyInterface14.method2");
        common();
    }

    private static void common() {
        System.out.println("어떤 기능1");
    }
}








