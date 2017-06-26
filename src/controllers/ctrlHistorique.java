package controllers;

import models.Client;
import models.Manager;
import vue.PanelClient;
import vue.PanelHistorique;
import models.*;
import vue.*;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Pierre-Louis on 08/03/2017.
 */
public class ctrlHistorique {

    private Client client;
    private PanelHistorique panelHisto;
    private Manager manager = new Manager();


    public ctrlHistorique(Client client, PanelHistorique panelhistorique) {
        this.client = client;
        this.panelHisto = panelhistorique;
    }

    public void setAction(PanelClient panelclient)
    {
        PanelClient lepanelclient = panelclient;

        ArrayList<Compte> lescomptes = manager.getComptesFromClient(client.getCodeClient());
        for(Compte leCompte : lescomptes)
        {
            panelHisto.getComboCompte().addItem(leCompte.getNumero());
        }

        // quand on clique sur le compte
        panelHisto.getComboCompte().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                panelHisto.getCombohistorique().removeAllItems();
                panelHisto.getLabelDateA().setText("");
                panelHisto.getLabelMontantA().setText("");
                JComboBox comboCompte = (JComboBox) e.getSource();
                String numCompte = comboCompte.getSelectedItem().toString();
                ArrayList<Operation> lesoperations = manager.getOperationsFromCompte(numCompte);
                for(Operation operation : lesoperations)
                {
                    panelHisto.getCombohistorique().addItem(operation.getDateOperation().toString());
                }
            }
        });
        panelHisto.getComboCompte().setSelectedIndex(0);
        panelHisto.getCombohistorique().setSelectedIndex(0);


        // quand on clique sur loperation correspondante
        panelHisto.getCombohistorique().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboCompte = (JComboBox) e.getSource();
                String dateOperation = comboCompte.getSelectedItem().toString();
                System.out.println(dateOperation);
                Operation operation = manager.getOperationsFromDate(dateOperation);
                panelHisto.getLabelMontantA().setText(operation.getMontantOperation().toString() + " €");
                panelHisto.getLabelDateA().setText(operation.getDateOperation().toString());
            }
        });
        panelHisto.getComboCompte().setSelectedIndex(0);
        panelHisto.getCombohistorique().setSelectedIndex(0);


        panelHisto.getBtnRetour().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelHisto.setVisible(false);
                lepanelclient.setVisible(true);
                lepanelclient.repaint();
                panelclient.getComboComptes().setSelectedIndex(0);
            }
        });
    }
}

