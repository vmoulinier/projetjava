package models;

/**
 * Created by vmoul on 10/01/2017.
 */
public class Banque {

    private String nomBanque;
    private String adresseBanque;
    private String cpBanque;
    private String villeBanque;

    public Banque(String nomBanque, String adresseBanque, String cpBanque, String villeBanque) {
        this.nomBanque = nomBanque;
        this.adresseBanque = adresseBanque;
        this.cpBanque = cpBanque;
        this.villeBanque = villeBanque;
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

    public String getCpBanque() {
        return cpBanque;
    }

    public void setCpBanque(String cpBanque) {
        this.cpBanque = cpBanque;
    }

    public String getVilleBanque() {
        return villeBanque;
    }

    public void setVilleBanque(String villeBanque) {
        this.villeBanque = villeBanque;
    }
}
