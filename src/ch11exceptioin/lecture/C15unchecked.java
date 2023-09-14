package ch11exceptioin.lecture;

import java.util.List;

public class C15unchecked {
    public static void main(String[] args) {
        var list = List.of(4, 5, 1);
        list.get(0);
        list.get(1);
        list.get(2);
        list.get(3); // RuntimeException (unchecked exception)

        System.out.println("프로그램 실행 이어감...");
    }
}
