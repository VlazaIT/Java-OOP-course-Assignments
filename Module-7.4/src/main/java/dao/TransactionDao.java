package dao;

import entity.Transaction;
import jakarta.persistence.*;

public class TransactionDao {
    private EntityManager em;

    public TransactionDao(EntityManager em) {
        this.em = em;
    }

    public void persist(Transaction transaction) {
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();
    }
}
