package ch06class;

public class C04array {
    public static void main(String[] args) {
        int[] a = {3, 4};

        System.out.println("a[0] = " + a[0]);

        a = method1();
        System.out.println("a[0] = " + a[0]); // 3? 22?
    }

    public static int[] method1() {
        int[] k = {22, 33};

        return k;
    }
}
