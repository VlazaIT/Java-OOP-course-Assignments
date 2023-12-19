package view;

import controller.CurrencyConverterController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurrencyConverterView extends javafx.application.Application {

    private CurrencyConverterController controller;

    @Override
    public void start(Stage primaryStage) {
        this.controller = new CurrencyConverterController();
        VBox layout = new VBox(10);

        // UI components
        ComboBox<String> sourceCurrency = new ComboBox<>();
        ComboBox<String> targetCurrency = new ComboBox<>();
        TextField amountField = new TextField();
        Button convertButton = new Button("Convert");

        convertButton.setOnAction(e -> controller.convertCurrency(
                sourceCurrency.getValue(),
                targetCurrency.getValue(),
                amountField.getText()
        ));

        layout.getChildren().addAll(sourceCurrency, targetCurrency, amountField, convertButton);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Currency Converter");
        primaryStage.show();

        // Initialize currencies in ComboBoxes
        controller.initializeCurrencies(sourceCurrency, targetCurrency);
    }

    // Other methods
}
