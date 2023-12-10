package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import model.Dictionary;

public class DictionaryView extends Application {
    private DictionaryController controller;

    @Override
    public void init() {
        Dictionary dictionary = new Dictionary();
        controller = new DictionaryController(dictionary);

        // Temporary data
        dictionary.addWord("hello", "A greeting used when meeting someone.");
        dictionary.addWord("world", "The earth, together with all of its countries and peoples.");
    }

    @Override
    public void start(Stage stage) {
        TextField wordField = new TextField();
        Button searchButton = new Button("Search");
        TextArea resultArea = new TextArea();

        VBox layout = new VBox(10, wordField, searchButton, resultArea);
        layout.setPadding(new Insets(10));

        searchButton.setOnAction(e -> {
            String result = controller.searchWord(wordField.getText());
            resultArea.setText(result);
        });

        Scene scene = new Scene(layout, 400, 300);
        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
