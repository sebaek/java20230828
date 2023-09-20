package ch12api.lecture;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class C30annotation {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<C30annotation> c = C30annotation.class;
        Method method1 = c.getDeclaredMethod("toString");
        System.out.println("method1.getName() = " + method1.getName());

        Annotation[] a = method1.getDeclaredAnnotations();
        System.out.println("a.length = " + a.length);
    }
}
