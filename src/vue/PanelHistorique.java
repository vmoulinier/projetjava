package vue;

import javax.swing.*;

/**
 * Created by Pierre-Louis on 08/03/2017.
 */
public class PanelHistorique extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel labelSolde = new JLabel("Liste des opérations ");
    private JLabel labelCompte = new JLabel("Compte n° ");
    private JLabel labelHistorique = new JLabel("Operation ");
    private JLabel labelMontant = new JLabel("Montant ");
    private JLabel labelMontantA = new JLabel(" ");
    private JLabel labelDate = new JLabel("Date ");
    private JLabel labelDateA = new JLabel(" ");
    private JComboBox comboCompte = new JComboBox();
    private JComboBox combohistorique = new JComboBox();
    private JButton btnRetour = new JButton("Retour");


    public PanelHistorique(){
        super("Opérations compte");
        setSize(360,370);
        setLocation(500,280);
        panel.setLayout (null);

        labelSolde.setBounds(120,10,160,30);
        add(labelSolde);

        labelCompte.setBounds(20,55,160,30);
        add(labelCompte);

        comboCompte.setBounds(100,55,160,30);
        add(comboCompte);

        labelHistorique.setBounds(20,100,160,30);
        add(labelHistorique);

        combohistorique.setBounds(100,100,160,30);
        add(combohistorique);

        labelMontant.setBounds(20,145,160,30);
        add(labelMontant);

        labelMontantA.setBounds(100,145,160,30);
        add(labelMontantA);

        labelDate.setBounds(20,190,160,30);
        add(labelDate);

        labelDateA.setBounds(100,190,160,30);
        add(labelDateA);

        btnRetour.setBounds(90,260,160,35);
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

    public JLabel getLabelMontantA() {
        return labelMontantA;
    }

    public void setLabelMontantA(JLabel labelMontantA) {
        this.labelMontantA = labelMontantA;
    }

    public JLabel getLabelDateA() {
        return labelDateA;
    }

    public void setLabelDateA(JLabel labelDateA) {
        this.labelDateA = labelDateA;
    }
}

