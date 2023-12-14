package controller;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import dao.CurrencyDao;
import entity.Currency;
import view.CurrencyConverterView;

public class CurrencyConverterController {
    private CurrencyConverterView view;
    private ObservableList<String> currencies; // Changed to store currency abbreviations
    private CurrencyDao currencyDao;

    public CurrencyConverterController(CurrencyConverterView view) {
        this.view = view;
        this.currencyDao = new CurrencyDao(); // Initialize the DAO
        this.currencies = FXCollections.observableArrayList("USD", "EUR", "JPY"); // Fetch this from DB if needed

        Platform.runLater(this::populateCurrencyChoices);
    }

    private void populateCurrencyChoices() {
        for (String currencyAbbreviation : currencies) {
            view.getSourceCurrencyComboBox().getItems().add(currencyAbbreviation);
            view.getTargetCurrencyComboBox().getItems().add(currencyAbbreviation);
        }
    }

    public void convertCurrency() {
        String source = view.getSourceCurrency();
        String target = view.getTargetCurrency();
        String amountText = view.getAmount();
        try {
            double amount = Double.parseDouble(amountText);
            double sourceRate = currencyDao.getExchangeRate(source);
            double targetRate = currencyDao.getExchangeRate(target);
            double result = (amount / sourceRate) * targetRate;
            view.setResult(String.format("%.2f", result));
        } catch (NumberFormatException e) {
            view.setResult("Invalid amount");
        } catch (Exception e) {
            view.setResult("Error: " + e.getMessage()); // Handle other exceptions
        }
    }
}
