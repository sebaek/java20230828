package ch99leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution771Test {

    @Test
    void numJewelsInStones() {
        Solution771 o = new Solution771();
        int i = o.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, i);

        int j = o.numJewelsInStones("z", "ZZ");
        assertEquals(0, j);

    }
}