package ch99leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1748Test {

    @Test
    void sumOfUnique() {
        Solution1748 s = new Solution1748();
        assertEquals(4, s.sumOfUnique(new int[]{1,2,3,2}));
        assertEquals(0, s.sumOfUnique(new int[]{1, 1, 1, 1, 1}));
        assertEquals(15, s.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }
}