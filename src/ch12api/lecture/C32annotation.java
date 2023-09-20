package ch12api.lecture;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class C32annotation {
    public static void main(String[] args) throws NoSuchMethodException {
        MyClass32 o1 = new MyClass32();
        int number = o1.getNumber();
        int value = o1.getValue();

        Class<? extends MyClass32> c = o1.getClass();
        Method m1 = c.getDeclaredMethod("getNumber");

        MyAnnotation32 a1 = m1.getAnnotation(MyAnnotation32.class);
        if (a1 != null) {
            System.out.println("number: " + number + "를 어노테이션에 따라 활용함");
        } else {
            System.out.println("number: " + number + "를 그냥 활용함");
        }

        Method m2 = c.getDeclaredMethod("getValue");

        MyAnnotation32 a2 = m2.getAnnotation(MyAnnotation32.class);
        if (a2 != null) {
            System.out.println("value: " + value + "를 어노테이션에 따라 활용함");
        } else {
            System.out.println("value: " + value + "를 그냥 활용함");
        }
        
    }
}

class MyClass32 {
    public int getValue() {
        return 300;
    }

    @MyAnnotation32
    public int getNumber() {
        return 500;
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation32 {

}
