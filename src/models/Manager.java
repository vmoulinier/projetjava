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

    public ArrayList<Compte> getComptesNotFromClient(int id) {

        ArrayList<Compte> arrayComptes = new ArrayList<>();

        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM compte WHERE id_client != '"+id+"'");

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

    public Compte getInfosCompte(String numeroCompte)
    {
        Compte compte = null;

        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM compte WHERE numero = '"+numeroCompte+"'");

            while (resSect.next())
            {
                compte = new Compte(resSect.getInt("id"), resSect.getString("numero"), resSect.getDouble("solde"), resSect.getString("type"), resSect.getInt("id_banque"), resSect.getInt("id_client"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return compte;
    }

    public Banque getInfosBanque(String numeroCompte)
    {
        Banque banque = null;

        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM banque INNER JOIN compte ON compte.id_banque = banque.id WHERE compte.numero = '"+numeroCompte+"'");

            while (resSect.next())
            {
                banque = new Banque(resSect.getInt("id"), resSect.getString("libelle"), resSect.getString("adresse"), resSect.getInt("cp"), resSect.getString("ville"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return banque;
    }

    public void setOperation(String comptedebite, String comptecredite, Double montant, String type, int id_client)
    {
        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            stmt.executeUpdate("INSERT INTO operation(numero_comptedebite, numero_comptecredite, montant, type, id_utilisateur) VALUES ('"+comptedebite+"','"+comptecredite+"','"+montant+"','"+type+"','"+id_client+"')");
            stmt.executeUpdate("UPDATE compte SET solde = solde - '"+montant+"' WHERE numero = '"+comptedebite+"'");
            stmt.executeUpdate("UPDATE compte SET solde = solde + '"+montant+"' WHERE numero = '"+comptecredite+"'");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    public ArrayList<Operation> getOperations(String Compte)
    {
        Operation operation;
        ArrayList<Operation> arrayOperation = new ArrayList<>();

        try {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM operation WHERE  operation.numero_comptedebite = "+Compte +" OR operation.numero_comptecredite = "+Compte);

            while (resSect.next()){
                operation = new Operation(resSect.getInt("id"), resSect.getString("libelle"), resSect.getString("numero_comptecredite"),resSect.getDouble("montant"),resSect.getString("type"),resSect.getTimestamp("date_operation"));
                arrayOperation.add(operation);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return arrayOperation;
    }

    public ArrayList<Operation> getOperationsFromCompte(String Compte)
    {
        Operation operation;
        ArrayList<Operation> arrayOperations = new ArrayList<>();

        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM operation WHERE numero_comptedebite = '" + Compte + "' OR numero_comptecredite = '" + Compte + "'" );

            while(resSect.next())
            {
                operation = new Operation(resSect.getInt("id"), resSect.getString("libelle"), resSect.getString("numero_comptecredite"),resSect.getDouble("montant"),resSect.getString("type"),resSect.getTimestamp("date_operation"));
                arrayOperations.add(operation);
            }
        }

        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return arrayOperations;
    }


    public Operation getOperationsFromDate(String date)
    {
        Operation operation = null;

        try
        {
            connexion.getconnection();
            Statement stmt = connexion.conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM operation WHERE date_operation = '" + date + "'" );

            while (resSect.next())
            {
                operation = new Operation(resSect.getInt("id"), resSect.getString("libelle"), resSect.getString("numero_comptecredite"),resSect.getDouble("montant"),resSect.getString("type"),resSect.getTimestamp("date_operation"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return operation;
    }
}
