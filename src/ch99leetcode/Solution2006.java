package ch99leetcode;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class Solution2006 {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()));

        return (int) map.entrySet()
                .stream()
                .collect(summarizingLong(e -> e.getValue() * map.getOrDefault(e.getKey() + k, 0L)))
                .getSum();
    }
}
