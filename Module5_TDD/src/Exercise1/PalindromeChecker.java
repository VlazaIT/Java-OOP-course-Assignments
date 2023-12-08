package Exercise1;

public class PalindromeChecker {

    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        // Clean the string: remove non-alphanumeric characters and convert to lower case
        String cleanedStr = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleanedStr.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // No mismatches found, it's a palindrome
    }
}

