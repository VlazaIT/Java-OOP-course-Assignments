package model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> words;

    public Dictionary() {
        words = new HashMap<>();
        // Initialize with some words
        words.put("example", "A representative form or pattern.");
        words.put("java", "A high-level, class-based, object-oriented programming language.");
        // Add more words as needed
    }

    public void addWord(String word, String meaning) {
        words.put(word, meaning);
    }

    public String getMeaning(String word) {
        return words.getOrDefault(word, null);
    }
}
