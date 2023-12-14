package datasource;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MariaDbJpaConnection {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("CurrencyConverterUnit");

    public static EntityManager createEntityManager() {
        return emf.createEntityManager();
    }
}
