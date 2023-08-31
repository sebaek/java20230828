package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C04string {
    public static void main(String[] args) {
        String a = "java";

        Object o = a;
        Serializable s = a;
        CharSequence c = a;
        Comparable<String> cp = a;
        Constable co = a;
        ConstantDesc cd = a;



    }
}
