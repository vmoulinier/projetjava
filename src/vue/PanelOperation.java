package vue;

import javax.swing.*;

/**
 * Created by vmoul on 13/01/2017.
 */
public class PanelOperation extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel labelCompteDebit = new JLabel("Compte à débiter ");
    private JLabel labelCompteCredit = new JLabel("Compte à créditer ");
    private JComboBox comboComptesDebit = new JComboBox();
    private JComboBox comboComptesCredit = new JComboBox();
    private JLabel labelSolde = new JLabel("Solde du compte ");
    private JLabel infoCompteSolde = new JLabel();
    private JLabel labelType = new JLabel("Type de compte ");
    private JLabel infoCompteType = new JLabel();
    private JLabel labelMontant = new JLabel("Montant opération ");
    private JTextField textMontant = new JTextField(20);
    private JButton btnValider = new JButton("Valider");
    private JButton btnRetour = new JButton("Retour");



    public PanelOperation(){
        super("Effectuer une opération");
        setSize(360,370);
        setLocation(500,280);
        panel.setLayout (null);

        labelCompteDebit.setBounds(15,15,160,30);
        add(labelCompteDebit);

        comboComptesDebit.setBounds(130,15,190,25);
        add(comboComptesDebit);

        labelCompteCredit.setBounds(15,65,160,25);
        add(labelCompteCredit);

        comboComptesCredit.setBounds(130,65,190,25);
        add(comboComptesCredit);

        labelSolde.setBounds(15,115,160,25);
        add(labelSolde);

        infoCompteSolde.setBounds(130,115,160,30);
        add(infoCompteSolde);

        labelType.setBounds(15,165,160,25);
        add(labelType);

        infoCompteType.setBounds(130,165,160,25);
        add(infoCompteType);

        labelMontant.setBounds(15,215,160,25);
        add(labelMontant);

        textMontant.setBounds(130,215,160,25);
        add(textMontant);

        btnValider.setBounds(175,265,130,35);
        add(btnValider);
        btnRetour.setBounds(35,265,130,35);
        add(btnRetour);


        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLabelCompteDebit() {
        return labelCompteDebit;
    }

    public void setLabelCompteDebit(JLabel labelCompteDebit) {
        this.labelCompteDebit = labelCompteDebit;
    }

    public JLabel getLabelCompteCredit() {
        return labelCompteCredit;
    }

    public void setLabelCompteCredit(JLabel labelCompteCredit) {
        this.labelCompteCredit = labelCompteCredit;
    }

    public JComboBox getComboComptesDebit() {
        return comboComptesDebit;
    }

    public void setComboComptesDebit(JComboBox comboComptesDebit) {
        this.comboComptesDebit = comboComptesDebit;
    }

    public JComboBox getComboComptesCredit() {
        return comboComptesCredit;
    }

    public void setComboComptesCredit(JComboBox comboComptesCredit) {
        this.comboComptesCredit = comboComptesCredit;
    }

    public JLabel getLabelSolde() {
        return labelSolde;
    }

    public void setLabelSolde(JLabel labelSolde) {
        this.labelSolde = labelSolde;
    }

    public JLabel getInfoCompteSolde() {
        return infoCompteSolde;
    }

    public void setInfoCompteSolde(JLabel infoCompteSolde) {
        this.infoCompteSolde = infoCompteSolde;
    }

    public JLabel getLabelType() {
        return labelType;
    }

    public void setLabelType(JLabel labelType) {
        this.labelType = labelType;
    }

    public JLabel getInfoCompteType() {
        return infoCompteType;
    }

    public void setInfoCompteType(JLabel infoCompteType) {
        this.infoCompteType = infoCompteType;
    }

    public JLabel getLabelMontant() {
        return labelMontant;
    }

    public void setLabelMontant(JLabel labelMontant) {
        this.labelMontant = labelMontant;
    }

    public JTextField getTextMontant() {
        return textMontant;
    }

    public void setTextMontant(JTextField textMontant) {
        this.textMontant = textMontant;
    }

    public JButton getBtnValider() {
        return btnValider;
    }

    public void setBtnValider(JButton btnValider) {
        this.btnValider = btnValider;
    }

    public JButton getBtnRetour() {
        return btnRetour;
    }

    public void setBtnRetour(JButton btnRetour) {
        this.btnRetour = btnRetour;
    }
}
