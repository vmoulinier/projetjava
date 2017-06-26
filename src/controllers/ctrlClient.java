package controllers;

import models.*;
import vue.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by vmoul on 10/01/2017.
 * Controleur qui affiche la fenetre permettant de voir les comptes pour un client
 */
public class ctrlClient {

    private Client client;
    private PanelClient panelclient;
    private Manager manager = new Manager();

    public ctrlClient(Client client, PanelClient panelclient) {
        this.client = client;
        this.panelclient = panelclient;
    }

    public void setActions() {
        ArrayList<Compte> list = manager.getComptesFromClient(client.getCodeClient());
        for(Compte compteClient : list)
        {
            panelclient.getComboComptes().addItem(compteClient.getNumero());
        }

        //Quand on selectionne un compte
        panelclient.getComboComptes().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JComboBox comboComptes = (JComboBox) event.getSource();
                String numCompte = comboComptes.getSelectedItem().toString();
                panelclient.getInfoCompteSolde().setText(manager.getInfosCompte(numCompte).getSolde()+" €");
                panelclient.getInfoCompteType().setText(manager.getInfosCompte(numCompte).getType());
                panelclient.getInfoCompteBanque().setText(manager.getInfosBanque(numCompte).getNomBanque());
                panelclient.getLabelNomPrenom().setText(client.getNomClient()+" "+client.getPrenomClient());
            }
        });
        panelclient.getComboComptes().setSelectedIndex(0);

        //Quand on clique sur le bouton effectuer une operation
        panelclient.getBtnOperation().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                PanelOperation Paneloperation = new PanelOperation();
                ctrlOperation ctrloperation = new ctrlOperation(client, Paneloperation);
                panelclient.setVisible(false);
                ctrloperation.setActions(panelclient);
            }
        });

        //Quand on clique sur le bouton historique des opérations
        panelclient.getBtnHistOperation().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                PanelHistorique Panelhistorique = new PanelHistorique();
                ctrlHistorique ctrlHistorique = new ctrlHistorique(client,Panelhistorique);
                panelclient.setVisible(false);
                ctrlHistorique.setAction(panelclient);
            }
        });
    }
}
