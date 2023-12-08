package Exercise1Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Exercise1.PalindromeChecker;

class PalindromeCheckerTest {

    @Test
    void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
        assertTrue(checker.isPalindrome("Racecar"));
        assertTrue(checker.isPalindrome("No lemon, no melon"));
    }
}
