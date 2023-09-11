package ch15collection.book.exercise.p09;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        int sum = 0;
        int max = 0;
        String id = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
            if (max < entry.getValue()) {
                max = entry.getValue();
                id = entry.getKey();
            }
        }


        System.out.println("sum = " + sum);
        System.out.println("avg = " + (sum / (double) map.size()));
        System.out.println("max = " + max);
        System.out.println("id = " + id);


    }
}
