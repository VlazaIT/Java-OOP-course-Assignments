package model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private final Map<String, String> words = new HashMap<>();

    public void addWord(String word, String meaning) {
        words.put(word.toLowerCase(), meaning);
    }

    public String search(String word) {
        return words.getOrDefault(word.toLowerCase(), null);
    }
}
