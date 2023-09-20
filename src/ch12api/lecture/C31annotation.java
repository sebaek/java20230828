package ch12api.lecture;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class C31annotation {
    
    @Override
    @MyAnnotation31
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) throws NoSuchMethodException {
        Class<C31annotation> c = C31annotation.class;
        Method m = c.getDeclaredMethod("toString");
        Annotation[] a = m.getDeclaredAnnotations();
        System.out.println("a.length = " + a.length);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation31 {

}
