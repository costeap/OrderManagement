package Bll;

import Dao.ClientDao;
import Model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Costea Paula, grupa 302210
 * @since Aprilie, 302210
 */
public class ClientBll {

    private ClientDao clientDao;

    public ClientBll() {
        clientDao = new ClientDao();
    }

    /**
     * Aceasta metoda apeleaza metoda din ClientDao pentru cautarea unui client din baza de date prin intermediul atributului clientDao.
     */
    public Client findClientById(int idClient) {
        Client st = clientDao.findById(idClient);
        if (st == null) {
            throw new NoSuchElementException("The client with id =" + idClient + " was not found!");
        }
        return st;
    }

    /**
     * Se apeleaza metoda din ClientDao pentru inserarea unui client in baza de date prin intermediul atributului clientDao.
     */
    public void insertClientB(Client client) {
        clientDao.insert(client);
    }

    /**
     * Se apeleaza metoda din ClientDao pentru stergerea unui client din baza de date prin intermediul atributului clientDao.
     */
    public void deleteClientB(int idClient) {
        clientDao.delete(idClient);
    }

    /**
     * Se apeleaza metoda din ClientDao pentru editarea numelui unui client din baza de date prin intermediul atributului clientDao.
     */
    public void updateClientB(int idClient, String numeClient) {
        clientDao.update(numeClient, idClient);
    }

    /**
     * Se apeleaza metoda din ClientDao pentru editarea adresei unui client din baza de date prin intermediul atributului clientDao.
     */
    public void updateClientAdresaB(int idClient, String adresaClient) {
        clientDao.updateAdresa(adresaClient, idClient);
    }

    /**
     * Se apeleaza metoda din ClientDao pentru cautarea tuturor clientilor din baza de date prin intermediul atributului clientDao.
     */
    public List<Client> viewAllClientsB() {
        return clientDao.viewAll();
    }


}
