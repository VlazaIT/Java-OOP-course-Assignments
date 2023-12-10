package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import controller.DictionaryController;

public class DictionaryView extends Application {
    private DictionaryController controller;

    @Override
    public void start(Stage stage) {
        controller = new DictionaryController();

        VBox layout = new VBox(10);
        TextField wordField = new TextField();
        Button searchButton = new Button("Search");
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);

        searchButton.setOnAction(e -> {
            String result = controller.searchWord(wordField.getText());
            resultArea.setText(result);
        });

        layout.getChildren().addAll(wordField, searchButton, resultArea);
        Scene scene = new Scene(layout, 400, 300);
        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}
