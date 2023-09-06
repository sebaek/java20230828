package ch12api.lecture;

public class C19hangul {
    public static void main(String[] args) {
        // 자바 문자 : unicode
        char a = '\u0d05';
        System.out.println(a);
        System.out.println('\u0041');

        System.out.println('\uac00');
        System.out.println('\ud7a3');

        System.out.println("손흥민".matches("[\uac00-\ud7a3]{3}"));
        System.out.println("이강인".matches("[\uac00-\ud7a3]{3}"));
        System.out.println("해리케인".matches("[\uac00-\ud7a3]{3}"));

        System.out.println("손흥민".matches("[가-힣]{3}"));
        System.out.println("이강인".matches("[가-힣]{3}"));
        System.out.println("해리케인".matches("[가-힣]{3}"));

        System.out.println("손흥민".matches("\\p{IsHangul}{3}"));
        System.out.println("이강인".matches("\\p{IsHangul}{3}"));
        System.out.println("해리케인".matches("\\p{IsHangul}{3}"));
    }
}
