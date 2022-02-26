package Incepe;

import Bll.ClientBll;
import Bll.OrderBll;
import Bll.ProductBll;
import Model.Client;
import Model.Comanda;
import Model.Product;
import Prezentare.*;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Costea Paula
 * @since Aprilie, 2021
 */
public class Main {

    protected static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    /**
     * Metoda care porneste executia programului.
     *
     * @param args
     */
    public static void main(String[] args) throws SQLException {

        /*ClientBll clientBll = new ClientBll();
        Client client1 = new Client();

        ProductBll productBll = new ProductBll();
        Product product1 = new Product();

        OrderBll orderBll = new OrderBll();
        Comanda order1 = new Comanda();

        try {
            client1 = clientBll.findClientById(100);
            //clientBll.deleteClientB(2);
            //Client c = new Client("Pop Rebeca", "Cluj");
            //clientBll.insertClientB(c);
            //clientBll.updateClientB(8, "Pop Raluca");
            //clientBll.updateClientAdresaB(8, "Suceava");


            //product1 = productBll.findProductById(2);
            //productBll.deleteProductB(2);
            //Product p = new Product("portocale", 25, 7);
            //productBll.insertProductB(p);
            //productBll.updateProductB(6, "vinete");
            //productBll.updateProductCantitateB(6, 50);

            //order1 = orderBll.findOrderById(1);
            //orderBll.insertOrder(3, 6, 25);
            //orderBll.deleteOrderB(2);
            //Client c = new Client("Pop Rebeca", "Cluj");
            //clientBll.insertClientB(c);
            //clientBll.updateClientB(8, "Pop Raluca");


        } catch (Exception ex) {
            LOGGER.log(Level.INFO, ex.getMessage());
        }

        Reflection.retrieveProperties(order1);
        */

        View db = new View();
        Controller controller = new Controller(db);
        db.setVisible(true);
    }
}
