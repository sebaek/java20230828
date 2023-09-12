package ch15collection.lecture;

import java.util.Map;

public class C18unmodifiable {
    public static void main(String[] args) {
        // 수정 불가 map
        Map<String, String> map = Map.of(
                "num1", "hm",
                "num2", "ki",
                "num3", "mj");

        System.out.println(map);
    }
}
