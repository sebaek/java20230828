package ch09nested.book.exercise.p06;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        anony.field.run();
        anony.method1();


        anony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다.");
            }
        });

        anony.method2(() -> System.out.println("트럭이달립니다.2"));
    }
}
