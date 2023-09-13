package ch99leetcode;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Solution2206 {
    public boolean divideArray(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                .values()
                .stream()
                .allMatch(e -> e % 2 == 0);
    }
}
