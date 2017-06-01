package vue;

import javax.swing.*;

/**
 * Created by Pierre-Louis on 08/03/2017.
 */
public class PanelHistorique extends JFrame {
    private JPanel panel = new JPanel();
    private JLabel labelSolde = new JLabel("Liste des opérations ");
    private JComboBox comboCompte = new JComboBox();
    private JComboBox combohistorique = new JComboBox();
    private JButton btnRetour = new JButton("Retour");


    public PanelHistorique(){
        super("Opérations compte");
        setSize(360,370);
        setLocation(500,280);
        panel.setLayout (null);


        labelSolde.setBounds(110,10,160,30);
        add(labelSolde);

        comboCompte.setBounds(110,50,160,30);
        add(comboCompte);

        combohistorique.setBounds(110,100,160,30);
        add(combohistorique);

        btnRetour.setBounds(110,150,160,30);
        add(btnRetour);


        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public JLabel getLabelSolde() {
        return labelSolde;
    }

    public void setLabelSolde(JLabel labelSolde) {
        this.labelSolde = labelSolde;
    }

    public JComboBox getCombohistorique() {
        return combohistorique;
    }

    public void setCombohistorique(JComboBox combohistorique) {
        this.combohistorique = combohistorique;
    }

    public JButton getBtnRetour() {
        return btnRetour;
    }

    public void setBtnRetour(JButton btnRetour) {
        this.btnRetour = btnRetour;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JComboBox getComboCompte() {
        return comboCompte;
    }

    public void setComboCompte(JComboBox comboCompte) {
        this.comboCompte = comboCompte;
    }
}

