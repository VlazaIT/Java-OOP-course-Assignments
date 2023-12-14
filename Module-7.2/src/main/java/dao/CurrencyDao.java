package dao;

import entity.Currency;
import datasource.MariaDbConnection;
import java.sql.*;

public class CurrencyDao {

    public double getExchangeRate(String abbreviation) {
        String sql = "SELECT conversion_rate FROM Currency WHERE abbreviation = ?";
        try (Connection conn = MariaDbConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, abbreviation);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("conversion_rate");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Replace with proper error handling
        }
        return 0.0;
    }
}

