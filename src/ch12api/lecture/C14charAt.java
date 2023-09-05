package ch12api.lecture;

public class C14charAt {
    public static void main(String[] args) {
        // charAt : 특정 인덱스의 char 리턴
        String a = "spring";
        char c = a.charAt(0);// 's'
        System.out.println(c);
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(a.length()-1));
//        System.out.println(a.charAt(6));

        System.out.println(a.charAt(0) + 0);
        System.out.println(a.charAt(0) + "");
    }
}
