package Dao;

import Conexiune.ConnectionFactory;
import Model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Costea Paula
 * @since Aprilie 2021
 */
public class ClientDao extends AbstractDAO<Client> {

    /**
     * Creeaza query-ul pentru editarea unui element din tabela "Client"
     */
    private String createUpdateQuery1(String coloana, String field2) {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(" client ");
        sb.append(" SET " + coloana + " =?");
        sb.append(" WHERE " + field2 + " =?");
        return sb.toString();
    }

    /**
     * Metoda modifica adresa clientului din baza de date, dupa valoarea data ca parametru.
     */
    public void updateAdresa(String nume, int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createUpdateQuery1("adresaClient", "id");
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setString(1, nume);
            statement.setInt(2, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, "DAO:updateAdresa " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
    }

}
