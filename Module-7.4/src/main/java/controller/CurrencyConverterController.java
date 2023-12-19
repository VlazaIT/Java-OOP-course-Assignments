package controller;

import dao.CurrencyDao;
import dao.TransactionDao;
import entity.Currency;
import entity.Transaction;
import javafx.scene.control.ComboBox;
import datasource.MariaDbJpaConnection;
import jakarta.persistence.EntityManager;

public class CurrencyConverterController {

    private CurrencyDao currencyDao;
    private TransactionDao transactionDao;

    public CurrencyConverterController() {
        EntityManager em = MariaDbJpaConnection.getInstance();
        this.currencyDao = new CurrencyDao(em);
        this.transactionDao = new TransactionDao(em);
    }

    public void initializeCurrencies(ComboBox<String> sourceCurrencyComboBox, ComboBox<String> targetCurrencyComboBox) {
        // Fetch and populate currencies in ComboBoxes
        // This is a placeholder implementation. You'll need to fetch the actual currency list from the database.
        sourceCurrencyComboBox.getItems().addAll("USD", "EUR", "JPY");
        targetCurrencyComboBox.getItems().addAll("USD", "EUR", "JPY");
    }

    public void convertCurrency(String sourceAbbreviation, String targetAbbreviation, String amountText) {
        try {
            double amount = Double.parseDouble(amountText);
            Currency sourceCurrency = currencyDao.findCurrencyByAbbreviation(sourceAbbreviation);
            Currency targetCurrency = currencyDao.findCurrencyByAbbreviation(targetAbbreviation);

            // Conversion logic
            double conversionRate = targetCurrency.getConversionRate() / sourceCurrency.getConversionRate();
            double convertedAmount = amount * conversionRate;

            // Persist transaction
            Transaction transaction = new Transaction(sourceCurrency, targetCurrency, amount, convertedAmount);
            transactionDao.persist(transaction);

            // Here, you might want to update the UI with the conversion result.
            // For example, you could call a method in the view class to display the converted amount.

        } catch (NumberFormatException e) {
            // Handle invalid input
            // You can update the UI to show an error message.
        }
    }
}
