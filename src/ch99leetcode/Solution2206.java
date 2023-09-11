package ch99leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution2206 {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (value % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}
