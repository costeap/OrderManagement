package Model;

/**
 * @author Costea Paula, grupa 302210
 * @since Aprilie 2021
 */
public class Comanda {
    private int id;
    private int cantitate;
    private int idClient;
    private int idProdus;

    /**
     * Constructorul clasei "Comanda"
     */
    public Comanda() {

    }

    /**
     * Constructorul clasei "Comanda", care atribuie atributelor valorile parametrilor
     *
     * @param cantitate
     * @param idClient
     * @param idProdus
     */
    public Comanda(int cantitate, int idClient, int idProdus) {
        this.cantitate = cantitate;
        this.idClient = idClient;
        this.idProdus = idProdus;
    }

    /**
     * @return id-ul comenzii
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return cantitatea
     */
    public int getCantitate() {
        return this.cantitate;
    }

    /**
     * @return id-ul clientului care a achizitionat produsul
     */
    public int getIdClient() {
        return this.idClient;
    }

    /**
     * @return id-ul produsului
     */
    public int getIdProdus() {
        return this.idProdus;
    }

    /**
     * Seteaza id-ul comenzii
     *
     * @param idOrder
     */
    public void setId(int idOrder) {
        this.id = idOrder;
    }

    /**
     * Seteaza cantitatea
     *
     * @param cantitate
     */
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    /**
     * Seteaza id-ul clientului
     *
     * @param idClient
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    /**
     * Seteaza id-ul produsului
     *
     * @param idProdus
     */
    public void setIdProdus(int idProdus) {
        this.idProdus = idProdus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + id +
                ", cantitate=" + cantitate +
                ", idClient=" + idClient +
                ", idProdus=" + idProdus +
                '}';
    }
}
