package ch99leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1684Test {

    @Test
    void countConsistentStrings() {
        Solution1684 o = new Solution1684();
        int i = o.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"});
        assertEquals(2, i);
        int j = o.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"});
        assertEquals(7, j);
        int k = o.countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"});
        assertEquals(4, k);


    }
}