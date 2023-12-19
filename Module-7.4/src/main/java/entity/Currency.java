package entity;

import jakarta.persistence.*;

@Entity
public class Currency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String abbreviation;
    private String name;
    private double conversionRate;

    public Currency() {}

    public Currency(String abbreviation, String name, double conversionRate) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.conversionRate = conversionRate;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Currency{" +
                "id=" + id +
                ", abbreviation='" + abbreviation + '\'' +
                ", name='" + name + '\'' +
                ", conversionRate=" + conversionRate +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }
}
