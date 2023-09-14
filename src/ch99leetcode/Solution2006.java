package ch99leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class Solution2006 {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(Function.identity(), counting()));

        return map.entrySet()
                .stream()
                .collect(summingLong(e -> e.getValue() * map.getOrDefault(e.getKey() + k, 0L)))
                .intValue();
    }
}
