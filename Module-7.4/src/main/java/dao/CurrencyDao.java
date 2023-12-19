package dao;

import entity.Currency;
import jakarta.persistence.*;

public class CurrencyDao {
    private EntityManager em;

    public CurrencyDao(EntityManager em) {
        this.em = em;
    }

    public Currency findCurrencyByAbbreviation(String abbreviation) {
        TypedQuery<Currency> query = em.createQuery("SELECT c FROM Currency c WHERE c.abbreviation = :abbreviation", Currency.class);
        query.setParameter("abbreviation", abbreviation);
        return query.getSingleResult();
    }

    // Other methods
}
