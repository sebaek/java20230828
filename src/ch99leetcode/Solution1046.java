package ch99leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();

        for (int stone : stones) {
            list.add(stone);
        }

        // list
        // sort, remove, add, size

        // [2, 7, 4, 1, 8, 1]

        // 1.sort
        // [8, 7, 4, 2, 1, 1]

        // 2.remove
        // [4, 2, 1, 1]

        // 3.add
        // [4, 2, 1, 1, 1]

        // 1.sort
        // [4, 2, 1, 1, 1]

        // 2.remove
        // [1, 1, 1]

        // 3.add
        // [1, 1, 1, 2]

        // 1.sort
        // [2, 1, 1, 1]

        // 2.remove
        // [1, 1]

        // 3.add
        // [1, 1, 1]

        // 1.sort
        // [1, 1, 1]

        // 2.remove
        // [1]

        // 3.add
        // [1]


        while (list.size() > 1) {
            // 1.sort
            list.sort((o1, o2) -> o2 - o1);

            // 2.remove
            int stone1 = list.remove(0);
            int stone2 = list.remove(0);

            // 3.add
            int diff = stone1 - stone2;
            if (diff > 0) {
                list.add(diff);
            }

        }

        if (list.size() == 1) {
            return list.get(0);
        }

        return 0;
    }
}
