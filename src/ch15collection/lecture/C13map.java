package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C13map {
    public static void main(String[] args) {
        // map 전체 탐색
        Map<String, String> map = new HashMap<>();
        map.put("학생1", "흥민");
        map.put("학생2", "강인");
        map.put("학생3", "민재");

        // 향상된 for
        System.out.println("향상된 for로 전체탐색");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // keySet


        // forEach

    }
}
