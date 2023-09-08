package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C05nestedList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(88);
        list.add(77);

        List<List<Integer>> list2 = new ArrayList<>();
        list2.add(List.of(9, 8, 7));
        list2.add(List.of(10, 20, 30));
        list2.add(List.of(3, 4, 5));




    }
}
