package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by vmoul on 11/01/2017.
 */
public class Connexion {

    Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/java_projet";
    String utilisateur = "root";
    String motDePasse = "";

    public Connection getconnection() throws SQLException
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

        return conn;
    }
}
