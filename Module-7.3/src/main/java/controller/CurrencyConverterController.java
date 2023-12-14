package controller;

import dao.CurrencyDao;
import entity.Currency;
import view.CurrencyConverterView;
import datasource.MariaDbJpaConnection;
import jakarta.persistence.EntityManager;

public class CurrencyConverterController {

    private CurrencyConverterView view;
    private CurrencyDao currencyDao;

    public CurrencyConverterController(CurrencyConverterView view) {
        EntityManager em = MariaDbJpaConnection.createEntityManager();
        this.currencyDao = new CurrencyDao(em);
        this.view = view;
        // Populate UI components
    }

    // Other methods
}
