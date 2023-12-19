package datasource;

import jakarta.persistence.*;

public class MariaDbJpaConnection {
    private static final String PERSISTENCE_UNIT_NAME = "CurrencyConverterUnit";
    private static EntityManagerFactory emf;

    public static EntityManager getInstance() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        return emf.createEntityManager();
    }
}
