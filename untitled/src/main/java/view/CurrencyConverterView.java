package view;

import controller.CurrencyConverterController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CurrencyConverterView extends Application {

    private CurrencyConverterController controller;

    private TextField amountField;
    private ComboBox<String> sourceCurrency;
    private ComboBox<String> targetCurrency;
    private Label resultLabel;

    @Override
    public void start(Stage stage) {
        VBox layout = new VBox(10);
        amountField = new TextField();
        sourceCurrency = new ComboBox<>();
        targetCurrency = new ComboBox<>();
        Button convertButton = new Button("Convert");
        resultLabel = new Label("Result");

        // Populate ComboBoxes here or in the controller's constructor AFTER initializing the controller
        this.controller = new CurrencyConverterController(this);

        layout.getChildren().addAll(amountField, sourceCurrency, targetCurrency, convertButton, resultLabel);
        convertButton.setOnAction(e -> controller.convertCurrency());

        Scene scene = new Scene(layout, 300, 200);
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.show();
    }


    public String getAmount() {
        return amountField.getText();
    }

    public String getSourceCurrency() {
        return sourceCurrency.getValue();
    }

    public String getTargetCurrency() {
        return targetCurrency.getValue();
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    public ComboBox<String> getSourceCurrencyComboBox() {
        return sourceCurrency;
    }

    public ComboBox<String> getTargetCurrencyComboBox() {
        return targetCurrency;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
