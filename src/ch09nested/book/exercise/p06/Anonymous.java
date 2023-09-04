package ch09nested.book.exercise.p06;

import java.sql.SQLOutput;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    Vehicle field2 = () -> System.out.println("자전거가 달립니다2");

    void method1() {
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        localVar.run();

        Vehicle localVar2 = () -> System.out.println("승용차가 달립니다.2");
        localVar2.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
