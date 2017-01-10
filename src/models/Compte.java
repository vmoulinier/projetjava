package models;

/**
 * Created by vmoul on 10/01/2017.
 */
public class Compte {

    private int codeClient;
    private String numeroCompte;
    private int codeBanque;

    public Compte(int codeClient, String numeroCompte) {
        this.codeClient = codeClient;
        this.numeroCompte = numeroCompte;
    }

    public int getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public int getCodeBanque() {
        return codeBanque;
    }

    public void setCodeBanque(int codeBanque) {
        this.codeBanque = codeBanque;
    }
}
