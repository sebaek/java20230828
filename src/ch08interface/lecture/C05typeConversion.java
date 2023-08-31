package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;

        // 상위 타입으로 형변환 하는 코드 최대한 많이 작성해 보기
        Number n = i;
        Object o = i;
        Serializable s = i;
        Comparable<Integer> c = i;
        Constable co = i;
        ConstantDesc cd = i;
    }
}
