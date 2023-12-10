package controller;

import javafx.application.Application;
import model.Dictionary;
import view.DictionaryView;

public class DictionaryController {
    private Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();
    }

    public String searchWord(String word) {
        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }
        String meaning = dictionary.getMeaning(word);
        if (meaning != null) {
            return meaning;
        } else {
            return "Word not found in dictionary.";
        }
    }

    public static void main(String[] args) {
        Application.launch(DictionaryView.class, args);
    }
}
