package models;

/**
 * Created by vmoul on 10/01/2017.
 */
public class Compte {

    private int id;
    private String numero;
    private Double solde;
    private String type;
    private int id_banque;
    private int id_client;

    public Compte(int id, String numero, Double solde, String type, int id_banque, int id_client) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.type = type;
        this.id_banque = id_banque;
        this.id_client = id_client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId_banque() {
        return id_banque;
    }

    public void setId_banque(int id_banque) {
        this.id_banque = id_banque;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", solde=" + solde +
                ", type='" + type + '\'' +
                ", id_banque=" + id_banque +
                ", id_client=" + id_client +
                '}';
    }
}
