package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C10instanceof {
    public static void main(String[] args) {
        // instanceof
        // 연산결과 : boolean
        // 좌변 : 참조변수
        // 우변 : 타입(클래스, 인터페이스.....)

        CharSequence c = "java";

        boolean r1 = c instanceof String; // true
        boolean r2 = c instanceof Serializable; // true
        boolean r3 = c instanceof Comparable; // true
        boolean r4 = c instanceof Constable; // true
        boolean r5 = c instanceof ConstantDesc; // true
        boolean r6 = c instanceof CharSequence; // true
        boolean r7 = c instanceof Object; // true

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);
        System.out.println("r7 = " + r7);
    }
}
