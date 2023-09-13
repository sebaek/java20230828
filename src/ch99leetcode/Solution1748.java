package ch99leetcode;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {
        // 1,2,3,2

        // 수 : 몇개 (counting)
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
        // 1개인 entry만 거르고(filter)
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
        // entry의 키들
                .map(e -> e.getKey())
        // 만 더하기
                .mapToInt(Integer::intValue)
                .sum();


    }
}
