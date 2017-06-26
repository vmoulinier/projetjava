package controllers;

import models.*;
import vue.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


/**
 * Created by vmoul on 13/01/2017.
 */
public class ctrlOperation {

    private Client client;
    private PanelOperation paneloperation;
    private Manager manager = new Manager();
    private Double montant;

    public ctrlOperation(Client client, PanelOperation paneloperation) {
        this.client = client;
        this.paneloperation = paneloperation;
    }

    boolean isDouble(String montantLabel) {
        try {
            Double.parseDouble(montantLabel);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void setActions(PanelClient panelclient) {
        PanelClient lepanelclient = panelclient;
        ArrayList<Compte> listComptes = manager.getComptesFromClient(client.getCodeClient());
        for(Compte compteClient : listComptes)
        {
            paneloperation.getComboComptesDebit().addItem(compteClient.getNumero());
        }

        ArrayList<Compte> listNotComptes = manager.getComptesNotFromClient(client.getCodeClient());
        for(Compte compteClient : listNotComptes)
        {
            Client leClient = manager.getInfosClient(compteClient.getId_client());
            paneloperation.getComboComptesCredit().addItem(compteClient.getNumero()+" (M. "+leClient.getNomClient()+")");
        }

        paneloperation.getComboComptesDebit().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JComboBox getComboComptesDebit = (JComboBox) event.getSource();
                String numCompte = getComboComptesDebit.getSelectedItem().toString();
                paneloperation.getInfoCompteSolde().setText(manager.getInfosCompte(numCompte).getSolde()+" €");
                paneloperation.getInfoCompteType().setText(manager.getInfosCompte(numCompte).getType());
            }
        });
        paneloperation.getComboComptesDebit().setSelectedIndex(0);

        paneloperation.getBtnValider().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numCompteDebite = paneloperation.getComboComptesDebit().getSelectedItem().toString();
                String numCompteCredite = paneloperation.getComboComptesCredit().getSelectedItem().toString().substring(0, 16);
                String type = paneloperation.getInfoCompteType().getText();
                String montantLabel = paneloperation.getTextMontant().getText();

                if(montantLabel.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrez un montant");
                    paneloperation.getTextMontant().requestFocus();
                }
                else {
                    if(isDouble(montantLabel)){
                        montant = Double.parseDouble(montantLabel);
                        manager.setOperation(numCompteDebite, numCompteCredite, montant, type, client.getCodeClient());
                        JOptionPane.showMessageDialog(null, "Opération effectuée");
                        paneloperation.repaint();
                        paneloperation.setVisible(false);
                        lepanelclient.setVisible(true);
                        lepanelclient.repaint();
                        panelclient.getComboComptes().setSelectedIndex(0);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Veuillez saisir un nombre");
                        paneloperation.getTextMontant().setText("");
                        paneloperation.getTextMontant().requestFocus();
                    }
                }

            }
        });

        paneloperation.getBtnRetour().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paneloperation.setVisible(false);
                lepanelclient.setVisible(true);
                lepanelclient.repaint();
                panelclient.getComboComptes().setSelectedIndex(0);
            }
        });
    }
}
