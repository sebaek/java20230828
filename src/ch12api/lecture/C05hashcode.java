package ch12api.lecture;

public class C05hashcode {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        int hashCode1 = o1.hashCode();
        int hashCode2 = o2.hashCode();

        System.out.println(hashCode1);
        System.out.println(hashCode2);
        System.out.println(o3.hashCode());
        System.out.println(o3.hashCode());

        Object o4 = o3;

        System.out.println(o4.hashCode());
    }
}
