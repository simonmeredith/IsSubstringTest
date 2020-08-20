package com.tis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubstringTest {

    IsSubstring isSubstring = new IsSubstring();

    @Test
    public void shoudReturnFalseIfNotASubstring() {
        assertFalse(IsSubstring.checkIfSubstring("This will be false", "true dat"));
    }

    @Test
    public void shouldReturnTrueIfSubstring() {
        assertTrue(IsSubstring.checkIfSubstring("This will be true", "ll be"));
    }

    @Test
    public void shouldReturnFalseIfPartialSubstring() {
        assertFalse(IsSubstring.checkIfSubstring("This should be false", "is shxx"));
    }

    @Test
    public void shouldReturnFalseIfStringOverruns() {
        assertFalse(IsSubstring.checkIfSubstring("This should also be false", "false it should be"));
    }
}