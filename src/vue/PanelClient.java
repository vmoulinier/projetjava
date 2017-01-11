package vue;

import javax.swing.*;
import models.Manager;

/**
 * Created by vmoul on 10/01/2017.
 */
public class PanelClient extends JFrame{
    public static void main(String[] args) {
        PanelClient frameTabel = new PanelClient();
    }

    JLabel welcome = new JLabel("Page client");
    JPanel panel = new JPanel();

    PanelClient(){
        super("Compte client");
        setSize(350,500);
        setLocation(500,280);
        panel.setLayout (null);

        welcome.setBounds(70,50,150,60);

        panel.add(welcome);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
