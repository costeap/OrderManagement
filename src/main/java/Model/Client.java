package Model;

/**
 * @author Costea Paula, grupa 302210
 * @since Aprilie 2021
 */
public class Client {
    private int id;
    private String nume;
    private String adresaClient;

    /**
     * Constructorul clasei "Client"
     */
    public Client() {
    }

    /**
     * Constructorul clasei "Client", care atribuie atributelor valorile parametrilor
     *
     * @param idClient
     * @param numeClient
     * @param adresaClient
     */
    public Client(int idClient, String numeClient, String adresaClient) {
        this.id = idClient;
        this.nume = numeClient;
        this.adresaClient = adresaClient;
    }

    /**
     * Constructorul clasei "Client", care atribuie atributelor valorile parametrilor
     *
     * @param numeClient
     * @param adresaClient
     */
    public Client(String numeClient, String adresaClient) {
        this.nume = numeClient;
        this.adresaClient = adresaClient;
    }

    /**
     * @return id-ul clientului
     */
    public int isId() {
        return this.id;
    }

    /**
     * @return numele clientului
     */
    public String isNume() {
        return this.nume;
    }

    /**
     * @return adresa clientului
     */
    public String getAdresaClient() {
        return this.adresaClient;
    }

    /**
     * Seteaza id-ul clientului
     *
     * @param idClient
     */
    public void setId(int idClient) {
        this.id = idClient;
    }

    /**
     * Seteaza numele clientului
     *
     * @param numeClient
     */
    public void setNume(String numeClient) {
        this.nume = numeClient;
    }

    /**
     * Seteaza adresa clientului
     *
     * @param adresaClient
     */
    public void setAdresaClient(String adresaClient) {
        this.adresaClient = adresaClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + id +
                ", numeClient='" + nume + '\'' +
                ", adresaClient='" + adresaClient + '\'' +
                '}';
    }
}
