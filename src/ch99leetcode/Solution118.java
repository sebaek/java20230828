package ch99leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {

        // [1, 3, 3, 1] : 이전 줄
        // [1, 4, 6, 4, 1] : 다음 줄

        // [1, 이전줄(0)+이전줄(1), 이전줄(1)+이전줄(2), 이전줄(2)+이전줄(3),.....,  1]

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = List.of(1);
        result.add(firstRow);

        List<Integer> prevRow = firstRow;
        for (int c = 1; c < numRows; c++) {
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            for (int i = 0; i < prevRow.size()-1; i++) {
                nextRow.add(prevRow.get(i) + prevRow.get(i + 1));
            }
            nextRow.add(1);

            result.add(nextRow);
            prevRow = nextRow;
        }

        return result;
    }
}
