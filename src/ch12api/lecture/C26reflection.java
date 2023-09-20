package ch12api.lecture;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class C26reflection {
    public static void main(String[] args) {
        MyClass26 o1 = new MyClass26("son");

        Class c = o1.getClass();

        System.out.println("c.getName() = " + c.getName());
        System.out.println("c.getSimpleName() = " + c.getSimpleName());
        System.out.println("c.getPackageName() = " + c.getPackageName());

        Field[] fields = c.getDeclaredFields();
        System.out.println("fields = " + fields.length);

        Constructor[] constructors = c.getDeclaredConstructors();
        System.out.println("constructors = " + constructors.length);

        Method[] methods = c.getDeclaredMethods();
        System.out.println("methods = " + methods.length);
    }
}

class MyClass26 {
    private String name;

    public MyClass26(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
