package ch99leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1512Test {

    @Test
    void numIdenticalPairs() {
        Solution1512 s = new Solution1512();
        int i = s.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        assertEquals(4, i);
        int j = s.numIdenticalPairs(new int[]{1, 1, 1, 1});
        assertEquals(6, j);
        int k = s.numIdenticalPairs(new int[]{1, 2, 3});
        assertEquals(0, k);
    }
}