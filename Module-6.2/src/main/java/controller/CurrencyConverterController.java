package controller;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Currency;
import view.CurrencyConverterView;

public class CurrencyConverterController {
    private CurrencyConverterView view;
    private ObservableList<Currency> currencies;

    public CurrencyConverterController(CurrencyConverterView view) {
        this.view = view;
        this.currencies = FXCollections.observableArrayList(
                new Currency("USD", "US Dollar", 1.0),
                new Currency("EUR", "Euro", 0.85),
                new Currency("JPY", "Japanese Yen", 110.0)
                // Add more currencies as needed
        );

        // Delay the population of ComboBoxes to ensure they are initialized
        Platform.runLater(this::populateCurrencyChoices);
    }


    private void populateCurrencyChoices() {
        for (Currency currency : currencies) {
            view.getSourceCurrencyComboBox().getItems().add(currency.getAbbreviation());
            view.getTargetCurrencyComboBox().getItems().add(currency.getAbbreviation());
        }
    }

    public void convertCurrency() {
        String source = view.getSourceCurrency();
        String target = view.getTargetCurrency();
        String amountText = view.getAmount();
        try {
            double amount = Double.parseDouble(amountText);
            double result = convert(amount, source, target);
            view.setResult(String.format("%.2f", result));
        } catch (NumberFormatException e) {
            view.setResult("Invalid amount");
        }
    }

    private double convert(double amount, String source, String target) {
        Currency sourceCurrency = findCurrency(source);
        Currency targetCurrency = findCurrency(target);
        if (sourceCurrency != null && targetCurrency != null) {
            double amountInUSD = amount / sourceCurrency.getConversionRateToUSD();
            return amountInUSD * targetCurrency.getConversionRateToUSD();
        }
        return 0;
    }

    private Currency findCurrency(String abbreviation) {
        for (Currency currency : currencies) {
            if (currency.getAbbreviation().equals(abbreviation)) {
                return currency;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Application.launch(CurrencyConverterView.class, args);
    }

}
