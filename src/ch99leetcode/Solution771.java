package ch99leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        // jewels : "aA"
        // stones : "aAAbbbb"

        Set<Character> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }

//        System.out.println(jewelSet);

        int count = 0;
        for (char c : stones.toCharArray()) {
            if (jewelSet.contains(c)) {
                count++;
            }
        }

        return count;
    }
}
