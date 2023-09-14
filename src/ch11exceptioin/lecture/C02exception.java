package ch11exceptioin.lecture;

public class C02exception {
    public static void main(String[] args) {
        System.out.println("code 1...");
        System.out.println("code 2...");

        int[] arr = {1, 2};
        int i = arr[2]; // IndexOfBoundsException

        System.out.println("code 3....");
    }
}
