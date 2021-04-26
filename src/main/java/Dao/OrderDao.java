package Dao;

import Conexiune.ConnectionFactory;
import Model.Comanda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 * @author Costea Paula, grupa 302210
 * @since Aprilie, 2021
 */

public class OrderDao extends AbstractDAO<Comanda> {

    private String createUpdateQuery(String coloana, String field2) {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(" order ");
        sb.append(" SET " + coloana + " =?");
        sb.append(" WHERE " + field2 + " =?");
        return sb.toString();
    }


    public void updateCantitate(int cantitate, int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createUpdateQuery("cantitate", "id");
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


    public void updateIdClient(int idClient, int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createUpdateQuery("idClient", "id");
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setInt(1, idClient);
            statement.setInt(2, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "DAO:updateIdClient " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
    }

    public void updateIdProdus(int idProdus, int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createUpdateQuery("idProdus", "id");
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setInt(1, idProdus);
            statement.setInt(2, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "DAO:updateIdProdus " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
    }


}
