package ch15collection.lecture;

import java.util.Stack;

public class C14stack {
    public static void main(String[] args) {
        // stack(LIFO: Last In First Out)
        // 주요 메소드
        // push : 마지막에 아이템 추가
        // pop : 마지막아이템 꺼내기

        // peek : 마지막아이템 보기

        Stack<Integer> stack = new Stack<>();
        stack.push(9);
        stack.push(8);
        stack.push(3);

        System.out.println("stack.size() = " + stack.size());

        Integer popped = stack.pop();
        System.out.println("popped = " + popped); // 3

        System.out.println("stack.pop() = " + stack.pop()); // 8
        System.out.println("stack.pop() = " + stack.pop()); // 9

        System.out.println("stack.size() = " + stack.size());
    }
}
