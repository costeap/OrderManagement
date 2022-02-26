package Bll;

import Dao.ClientDao;
import Dao.OrderDao;
import Dao.ProductDao;
import Model.Client;
import Model.Comanda;
import Model.Product;
import Prezentare.OrderView;

import javax.swing.*;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Costea Paula
 * @since Aprilie, 2021
 */
public class OrderBll {
    private OrderDao orderDao;
    private ProductDao productDao;
    private ClientDao clientDao;
    private OrderView orderView = new OrderView();

    public OrderBll() {
        orderDao = new OrderDao();
        productDao = new ProductDao();
        clientDao = new ClientDao();
    }

    /**
     * Aceasta metoda apeleaza metoda din OrderDao pentru cautarea unei comenzi in baza de date prin intermediul atributului orderDao.
     *
     * @param idOrder
     */
    public Comanda findOrderById(int idOrder) {
        Comanda st = orderDao.findById(idOrder);
        if (st == null) {
            throw new NoSuchElementException("The order with id =" + idOrder + " was not found!");
        }
        return st;
    }

    /**
     * Metoda "validateOrder" verifica daca exista vreun client  cu id-ul "idClient"
     * si vreun produs cu id-ul "idProduct",si daca  cantitatea pe care vrem sa o
     * comandam este mai mica decat cantitatea disponibila a produsului respectiv.
     *
     * @param idClient
     * @param idProduct
     * @param cantitate
     */
    public int validateOrder(int idClient, int idProduct, int cantitate) {
        ClientDao cd = new ClientDao();
        ProductDao pd = new ProductDao();
        Client c = cd.findById(idClient);
        if (c == null) {
            System.out.println("Client invalid!");
            JOptionPane.showMessageDialog(orderView, "Client invalid!");
            return 0;
        }

        Product p = pd.findById(idProduct);
        if (p == null) {
            System.out.println("Produs invalid!");
            JOptionPane.showMessageDialog(orderView, "Produs invalid!");
            return 0;
        }

        if (cantitate > p.getCantitate()) {
            System.out.println("Nu avem suficienta cantitate de produs!");
            JOptionPane.showMessageDialog(orderView, "Nu avem suficienta cantitate de produs!");
            return 0;
        }

        return 1;
    }

    /**
     * In aceasta metoda , in cazul in care comanda este valida , adaugam in baza de data comanda respectiva.
     *
     * @param idClient
     * @param idProduct
     * @param cantitate
     */
    public void insertOrder(int idClient, int idProduct, int cantitate) {
        if (validateOrder(idClient, idProduct, cantitate) == 1) {
            Product p = new Product();
            p = productDao.findById(idProduct);
            Comanda o = new Comanda(cantitate, idClient, idProduct);
            orderDao.insert(o);
            p.setCantitate(p.getCantitate() - cantitate);
            System.out.println(p.toString());
            productDao.updateCantitate(p.getCantitate(), p.getId());
        }
    }


    public void updateOrderCantitateB(int idOrder, int cantitate) {
        orderDao.updateCantitate(idOrder, cantitate);
    }

    public void updateOrderIdClientB(int idOrder, int idClient, int idProdus, int cantitate) {
        if (validateOrder(idClient, idProdus, cantitate) == 1) {
            orderDao.updateCantitate(idOrder, idClient);
        }
    }

    public void updateOrderIdProdusB(int idOrder, int idClient, int idProdus, int cantitate) {
        if (validateOrder(idClient, idProdus, cantitate) == 1) {
            orderDao.updateCantitate(idOrder, idProdus);
        }
    }

    /**
     * Se apeleaza metoda din OrderDao pentru stergerea unei comenzi din baza de date prin intermediul atributului orderDao.
     *
     * @param idOrder
     */
    public void deleteOrderB(int idOrder) {
        orderDao.delete(idOrder);
    }

    /**
     * Se apeleaza metoda din OrderDao pentru cautarea tuturor comenzilor din baza de date prin intermediul atributului orderDao.
     */
    public List<Comanda> viewAllOrdersB() {
        return orderDao.viewAll();
    }
}
