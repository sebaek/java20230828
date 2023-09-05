package ch12api.lecture;

public class C06hashcode {
    public static void main(String[] args) {
        String o1 = new String("java");
        String o2 = new String("spring");
        String o3 = new String("java");

        System.out.println(o1 == o2); //false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1 == o3); //false
        System.out.println(o1.hashCode());
        System.out.println(o3.hashCode());

        Object o4 = o1;
        Object o5 = o3;

        System.out.println(o4.hashCode());
        System.out.println(o5.hashCode());
    }
}
