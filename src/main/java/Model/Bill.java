package Model;

public class Bill {
    private String numeClient;
    private int idBill;
    private float pretTotal;

    public Bill()
    {

    }

    public String getNumeClient() {
        return this.numeClient;
    }

    public int getIdBill() {
        return this.idBill;
    }

    public float getPretTotal() {
        return this.pretTotal;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public void setPretTotal(float pretTotal) {
        this.pretTotal = pretTotal;
    }
}
