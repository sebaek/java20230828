package ch99leetcode;

import java.util.Arrays;
import java.util.List;

public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 배열에서 최대값 구하기 [2, 3, 5, 1, 3]
        int max = Arrays.stream(candies)
                .max()
                .getAsInt();

        // extra와 더해서 max보다 크거나 같은지를 arraylist에 추가
        // [2, 3, 5, 1, 3]
        // list.add((2 + 3) >= 5); // true
        // list.add((3 + 3) >= 5); // true
        // list.add((5 + 3) >= 5); // true
        // list.add((1 + 3) >= 5); // false
        // list.add((3 + 3) >= 5); // true
        return Arrays.stream(candies)
                .map(c -> c + extraCandies)
                .mapToObj(c -> c >= max)
                .toList();
    }
}
