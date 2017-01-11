package vue;

import javax.swing.*;
import models.Client;

/**
 * Created by vmoul on 10/01/2017.
 */
public class PanelClient extends JFrame{

    JPanel panel = new JPanel();


    PanelClient(Client leClient){
        super("Compte client");
        System.out.println(leClient.getMdpClient());
        setSize(350,500);
        setLocation(500,280);
        panel.setLayout (null);
        JLabel welcome = new JLabel(leClient.getPrenomClient());
        welcome.setBounds(70,50,150,60);

        panel.add(welcome);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
