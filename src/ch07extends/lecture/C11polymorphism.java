package ch07extends.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        String t = new String("java");

//        String t = o; // x

        int v1 = s.hashCode();
        int v2 = o.hashCode();
        int v3 = t.hashCode();

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);


        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(o));
        System.out.println(System.identityHashCode(t));
    }
}
