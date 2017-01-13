package models;

/**
 * Created by vmoul on 10/01/2017.
 */
public class Client {

    private int codeClient;
    private String nomClient;
    private String prenomClient;
    private String mdpClient;
    private String adresseClient;
    private String cpClient;
    private String villeClient;

    public Client(int codeClient, String nomClient, String prenomClient, String mdpClient, String adresseClient, String cpClient, String villeClient) {
        this.codeClient = codeClient;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.mdpClient = mdpClient;
        this.adresseClient = adresseClient;
        this.cpClient = cpClient;
        this.villeClient = villeClient;
    }

    public Client(Client cli) {
        this.codeClient = cli.getCodeClient();
        this.nomClient = cli.getNomClient();
        this.prenomClient = cli.getPrenomClient();
        this.mdpClient = cli.getMdpClient();
        this.adresseClient = cli.getAdresseClient();
        this.cpClient = cli.getCpClient();
        this.villeClient = cli.getVilleClient();
    }

    public int getCodeClient() {
        return codeClient;
    }

    public void setCodeClient(int codeClient) {
        this.codeClient = codeClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getMdpClient() {
        return mdpClient;
    }

    public void setMdpClient(String mdpClient) {
        this.mdpClient = mdpClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public String getCpClient() {
        return cpClient;
    }

    public void setCpClient(String cpClient) {
        this.cpClient = cpClient;
    }

    public String getVilleClient() {
        return villeClient;
    }

    public void setVilleClient(String villeClient) {
        this.villeClient = villeClient;
    }
}


