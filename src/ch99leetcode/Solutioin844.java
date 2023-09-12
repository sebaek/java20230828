package ch99leetcode;

import java.util.Stack;

public class Solutioin844 {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (stack1.size() > 0) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (stack2.size() > 0) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }



        return stack1.equals(stack2);
    }
}
