package ch12api.book.exercise.p17;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    // 첫번째는 알파벳
    // 두번째부터 숫자와 알파벳
    // 8~12
    // 대소문자허용
    public static void main(String[] args) {
        String id = "AAngel1004";
        String pattern = "[a-zA-Z][a-zA-Z0-9]{7,11}";

        boolean isMatch = id.matches(pattern);
        boolean isMatch2 = Pattern.matches(pattern, id);

        if (isMatch) {
            System.out.println("ID로 사용할 수 있습니다.");
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }

    }
}
