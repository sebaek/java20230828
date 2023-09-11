package ch99leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution287Test {

    @Test
    void findDuplicate() {
        Solution287 o = new Solution287();
        int num1 = o.findDuplicate(new int[]{1, 3, 4, 2, 2});
        assertEquals(2, num1);

        int num2 = o.findDuplicate(new int[]{3, 1, 3, 4, 2});
        assertEquals(3, num2);

    }
}