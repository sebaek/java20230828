package ch15collection.book.sec04.exam01;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        System.out.println("map.size() = " + map.size());

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ":" + value);

        System.out.println("향상된 for문으로 전체탐색");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("forEach로 전체탐색");
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        map.remove("홍길동");
        System.out.println("map.size() = " + map.size());
        
    }
}
