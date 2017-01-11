package models;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by vmoul on 10/01/2017.
 */
public class Manager {

    Connexion connexion = new Connexion();

    public Client getInfosClient(int codeClient)
    {
        Client client = null;

        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM client WHERE id = '"+codeClient+"'");

            while (resSect.next())
            {
                client = new Client(resSect.getInt("id"), resSect.getString("nom"), resSect.getString("prenom"), resSect.getString("mdp"), resSect.getString("adresse"), resSect.getString("cp"), resSect.getString("ville"));
        }
            resSect.close();
            connexion.conn.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return client;
    }

    public int login(String nom, String password) {

        int res = 0;

        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM client WHERE nom = '"+nom+"' AND mdp = '"+password+"'");

            while (resSect.next())
            {
                int size = resSect.getRow();

                if(size != 0) {
                    res = resSect.getInt("id");
                }
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return res;

    }

    public ArrayList<Compte> getComptesFromClient(int id) {

        ArrayList<Compte> arrayComptes = new ArrayList<>();

        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM compte WHERE id_client = '"+id+"'");

            while (resSect.next())
            {
                Compte compte = new Compte(resSect.getInt("id"), resSect.getString("numero"), resSect.getDouble("solde"), resSect.getString("type"), resSect.getInt("id_banque"), resSect.getInt("id_client"));
                arrayComptes.add(compte);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return arrayComptes;

    }

    public String getSoldeCompte(String numeroCompte)
    {
        String res = "";

        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM compte WHERE numero = '"+numeroCompte+"'");

            while (resSect.next())
            {
                res = resSect.getString("solde");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return res;
    }


}
