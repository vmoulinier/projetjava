package controllers;

import models.*;
import vue.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vmoul on 12/01/2017.
 */
public class ctrlLogin {

    private Client client;
    private PanelLogin panellogin;
    private Manager manager = new Manager();

    public ctrlLogin(PanelLogin panellogin) {
        this.panellogin = panellogin;
    }

    public void actionlogin() {
        panellogin.getLoginButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String puname = panellogin.getUserText().getText();
                String ppaswd = panellogin.getPasswordText().getText();
                if (manager.login(puname, ppaswd) != 0) {

                    client = new Client(manager.getInfosClient(manager.login(puname, ppaswd)));

                    System.out.println(client.getNomClient());

                    PanelClient panelclient = new PanelClient();
                    ctrlClient ctrlclient = new ctrlClient(client, panelclient);
                    panellogin.setVisible(false);
                    ctrlclient.setActions();

                } else {

                    JOptionPane.showMessageDialog(null, "Mauvais MDP / Nom");
                    panellogin.getUserText().setText("");
                    panellogin.getPasswordText().setText("");
                    panellogin.getUserText().requestFocus();
                }
            }
        });
    }
}
