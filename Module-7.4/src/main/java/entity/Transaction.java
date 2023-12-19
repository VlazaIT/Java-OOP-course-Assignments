package entity;

import jakarta.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Currency sourceCurrency;

    @ManyToOne
    private Currency targetCurrency;

    private double amount;
    private double convertedAmount;

    public Transaction() {}

    public Transaction(Currency sourceCurrency, Currency targetCurrency, double amount, double convertedAmount) {
        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.amount = amount;
        this.convertedAmount = convertedAmount;
    }

    // Getters and Setters
}
