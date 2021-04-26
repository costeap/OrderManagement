package Model;

/**
 * @author Costea Paula, grupa 302210
 * @since Aprilie 2021
 */
public class Product {
    private int id;
    private String nume;
    private int cantitate;
    private float pret;

    /**
     * Constructorul clasei "Product"
     */
    public Product() {
    }

    /**
     * Constructorul clasei "Product", care atribuie atributelor valorile parametrilor
     *
     * @param numeProdus
     * @param cantitate
     * @param pret
     */
    public Product(String numeProdus, int cantitate, float pret) {
        this.nume = numeProdus;
        this.cantitate = cantitate;
        this.pret = pret;
    }

    /**
     * @return id-ul produsului
     */
    public int getId() {
        return id;
    }

    /**
     * @return numele produsului
     */
    public String getNume() {
        return nume;
    }

    /**
     * @return cantitatea
     */
    public int getCantitate() {
        return cantitate;
    }

    /**
     * @return pretul produsului
     */
    public float getPret() {
        return pret;
    }

    /**
     * Seteaza id-ul produsului
     *
     * @param idProdus
     */
    public void setId(int idProdus) {
        this.id = idProdus;
    }

    /**
     * Seteaza numele produsului
     *
     * @param numeProdus
     */
    public void setNume(String numeProdus) {
        this.nume = numeProdus;
    }

    /**
     * Seteaza cantitatea produsului
     *
     * @param cantitate
     */
    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    /**
     * Seteaza pretul produsului
     *
     * @param pret
     */
    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProdus=" + id +
                ", numeProdus='" + nume + '\'' +
                ", cantitate=" + cantitate +
                ", pret=" + pret +
                '}';
    }
}
