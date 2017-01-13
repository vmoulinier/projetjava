package models;

/**
 * Created by vmoul on 10/01/2017.
 */
public class Banque {

    private int idBanque;
    private String nomBanque;
    private String adresseBanque;
    private int cpBanque;
    private String villeBanque;

    public Banque(int idBanque, String nomBanque, String adresseBanque, int cpBanque, String villeBanque) {
        this.idBanque = idBanque;
        this.nomBanque = nomBanque;
        this.adresseBanque = adresseBanque;
        this.cpBanque = cpBanque;
        this.villeBanque = villeBanque;
    }

    public int getIdBanque() {
        return idBanque;
    }

    public void setIdBanque(int idBanque) {
        this.idBanque = idBanque;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public String getAdresseBanque() {
        return adresseBanque;
    }

    public void setAdresseBanque(String adresseBanque) {
        this.adresseBanque = adresseBanque;
    }

    public int getCpBanque() {
        return cpBanque;
    }

    public void setCpBanque(int cpBanque) {
        this.cpBanque = cpBanque;
    }

    public String getVilleBanque() {
        return villeBanque;
    }

    public void setVilleBanque(String villeBanque) {
        this.villeBanque = villeBanque;
    }
}
