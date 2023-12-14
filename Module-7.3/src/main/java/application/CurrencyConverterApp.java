package application;

import javafx.application.Application;
import javafx.stage.Stage;
import view.CurrencyConverterView;

public class CurrencyConverterApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        CurrencyConverterView view = new CurrencyConverterView();
        view.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
