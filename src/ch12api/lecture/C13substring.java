package ch12api.lecture;

public class C13substring {
    public static void main(String[] args) {
        // substring : 부분 문자열 추출
        String a = "spring";

        String sub1 = a.substring(0, 2);// sp
        System.out.println(sub1);

        String sub2 = a.substring(2, 5);// rin
        System.out.println(sub2);

        System.out.println(a.substring(2, 6)); // ring
//        System.out.println(a.substring(2, 7)); //

        System.out.println(a.substring(2)); // ring
        System.out.println(a.substring(0)); // spring
    }
}
