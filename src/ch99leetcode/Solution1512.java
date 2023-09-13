package ch99leetcode;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        // [1, 2, 3, 1, 1, 3]

        // [1, 3] : 1+2
        // [2, 1] : 0
        // [3, 2] : 1
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .values()
                .stream()
                .map(n -> (n) * (n - 1) / 2)
                .mapToInt(n -> n.intValue())
                .sum();
    }
}
