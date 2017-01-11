package models;

import java.sql.*;

/**
 * Created by vmoul on 10/01/2017.
 */
public class Manager {

    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/java_projet";
    String utilisateur = "root";
    String motDePasse = "";

    private void getconnection() throws SQLException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection( url, utilisateur, motDePasse );
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Ca a planté");
        }
    }

    public Client getInfosClient(int codeClient)
    {
        Client client = null;

        try
        {
            getconnection();
            Statement stmt = conn.createStatement();
            ResultSet resSect = stmt.executeQuery("SELECT * FROM client WHERE id = '"+codeClient+"'");

            while (resSect.next())
            {
                client = new Client(resSect.getInt("id"), resSect.getString("nom"), resSect.getString("prenom"), resSect.getString("mdp"), resSect.getString("adresse"), resSect.getString("cp"), resSect.getString("ville"));
        }
            resSect.close();
            conn.close();
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
            getconnection();
            Statement stmt = conn.createStatement();
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

}
