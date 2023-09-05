package ch12api.lecture;

public class C09equals {
    public static void main(String[] args) {
        Object o1 = new String("java");
        Object o2 = new String("spring");
        Object o3 = new String("java");

        System.out.println(o1 == o2); // false
        System.out.println(o1 == o3); // false

        System.out.println(o1.equals(o2)); // false
        System.out.println(o1.equals(o3)); // true

    }
}
