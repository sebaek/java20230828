package ch07extends.lecture;

public class MyClass30 {
    private void privateMethod() {
        System.out.println("MyClass30.privateMethod");
    }

    public void publicMethod() {
        System.out.println("MyClass30.publicMethod");

        // private 멤버(필드,생성자,메소드) 접근 가능
        privateMethod();
    }

    void packagePrivateMethod() {
        System.out.println("MyClass30.packagePrivateMethod");

        // private 멤버 접근 가능
        privateMethod();
        protectedMethod();
    }

    protected void protectedMethod() {
        System.out.println("MyClass30.protectedMethod");

        privateMethod();
        packagePrivateMethod();
        publicMethod();
    }
}
