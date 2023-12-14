package view;

import controller.CurrencyConverterController;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurrencyConverterView {

    private CurrencyConverterController controller;

    public void start(Stage primaryStage) {
        this.controller = new CurrencyConverterController(this);
        VBox layout = new VBox();
        // Build UI components
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Other methods
}
