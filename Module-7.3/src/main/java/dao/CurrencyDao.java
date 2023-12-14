package dao;

import entity.Currency;
import jakarta.persistence.EntityManager;
import java.util.List;

public class CurrencyDao {

    private EntityManager em;

    public CurrencyDao(EntityManager em) {
        this.em = em;
    }

    public Currency getCurrencyByAbbreviation(String abbreviation) {
        return em.find(Currency.class, abbreviation);
    }

    public void addCurrency(Currency currency) {
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }

    public List<Currency> getAllCurrencies() {
        return em.createQuery("SELECT c FROM Currency c", Currency.class).getResultList();
    }
}
