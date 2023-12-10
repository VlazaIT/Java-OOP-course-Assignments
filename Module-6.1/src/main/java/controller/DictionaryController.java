package controller;

import model.Dictionary;

public class DictionaryController {
    private final Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String searchWord(String word) {
        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }

        String meaning = dictionary.search(word.trim());
        if (meaning == null) {
            return "Word not found.";
        }

        return meaning;
    }
}
