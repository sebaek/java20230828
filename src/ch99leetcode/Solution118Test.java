package ch99leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution118Test {

    @Test
    void generate() {
        Solution118 o1 = new Solution118();
        List<List<Integer>> list1 = o1.generate(1);
        assertEquals(1, list1.size());
        assertEquals(List.of(1), list1.get(0));

        List<List<Integer>> list2 = o1.generate(5);
        assertEquals(5, list2.size());
        assertEquals(List.of(1), list2.get(0));
        assertEquals(List.of(1, 1), list2.get(1));
        assertEquals(List.of(1, 2, 1), list2.get(2));
        assertEquals(List.of(1, 3, 3, 1), list2.get(3));
        assertEquals(List.of(1, 4, 6, 4, 1), list2.get(4));

    }
}