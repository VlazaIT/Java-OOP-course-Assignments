package Exercise2Test;

import Exercise2.StringManipulator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    StringManipulator sm = new StringManipulator();

    @Test
    void testConcatenate() {
        assertEquals("HelloWorld", sm.concatenate("Hello", "World"));
    }

    @Test
    void testFindLength() {
        assertEquals(5, sm.findLength("Hello"));
    }

    @Test
    void testConvertToUpperCase() {
        assertEquals("HELLO", sm.convertToUpperCase("Hello"));
    }

    @Test
    void testConvertToLowerCase() {
        assertEquals("hello", sm.convertToLowerCase("Hello"));
    }

    @Test
    void testContainsSubstring() {
        assertTrue(sm.containsSubstring("Hello", "ell"));
        assertFalse(sm.containsSubstring("Hello", "xyz"));
    }
}

