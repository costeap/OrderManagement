package Dao;

import Conexiune.ConnectionFactory;
import Model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Costea Paula, grupa 302210
 * @since Aprlie, 2021
 */
public class ProductDao extends AbstractDAO<Product> {

    /**
     * Creeaza query-ul pentru editarea unui element din tabela "Product"
     */
    private String createUpdateQuery1(String coloana, String field2) {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(" product ");
        sb.append(" SET " + coloana + " =?");
        sb.append(" WHERE " + field2 + " =?");
        return sb.toString();
    }

    /**
     * Metoda modifica cantitatea produsului din baza de date, dupa valoarea data ca parametru.
     */
    public void updateCantitate(int cantitate, int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createUpdateQuery1("cantitate", "id");
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setInt(1, cantitate);
            statement.setInt(2, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "DAO:updateCantitate " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
    }

    /**
     * Metoda modifica pretul produsului din baza de date, dupa valoarea data ca parametru.
     */
    public void updatePret(int pret, int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createUpdateQuery1("pret", "id");
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setInt(1, pret);
            statement.setInt(2, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "DAO:updatePret " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
    }


}
