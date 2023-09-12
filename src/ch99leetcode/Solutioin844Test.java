package ch99leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solutioin844Test {

    @Test
    void backspaceCompare() {
        Solutioin844 o = new Solutioin844();
        assertEquals(true, o.backspaceCompare("ab#c", "ad#c"));
        assertEquals(true, o.backspaceCompare("ab##", "c#d#"));
        assertEquals(false, o.backspaceCompare("a#c", "b"));
        assertEquals(true, o.backspaceCompare("a##c", "#a#c"));
    }
}