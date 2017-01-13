package vue;
import javax.swing.*;

/**
 * Created by vmoul on 10/01/2017.
 */
public class PanelClient extends JFrame {

    private JPanel panel = new JPanel();
    private JLabel labelNomPrenom = new JLabel();
    private JLabel labelCompte = new JLabel("Compte n° ");
    private JLabel labelSolde = new JLabel("Solde ");
    private JLabel labelType = new JLabel("Type ");
    private JLabel labelNomBanque = new JLabel("Banque ");
    private JLabel infoCompteSolde = new JLabel();
    private JLabel infoCompteType = new JLabel();
    private JLabel infoCompteBanque = new JLabel();
    private JComboBox comboComptes = new JComboBox();
    private JButton btnOperation = new JButton("Effectuer opération");
    private JButton btnHistOperation = new JButton("Historique opérations");

    public PanelClient(){
        super("Compte client");
        setSize(360,370);
        setLocation(500,280);
        panel.setLayout (null);

        labelNomPrenom.setBounds(120,10,160,30);
        add(labelNomPrenom);

        labelCompte.setBounds(20,55,160,30);
        add(labelCompte);

        labelSolde.setBounds(20,105,160,30);
        add(labelSolde);

        labelType.setBounds(20,155,160,30);
        add(labelType);

        labelNomBanque.setBounds(20,205,160,30);
        add(labelNomBanque);

        infoCompteSolde.setBounds(100,105,160,30);
        add(infoCompteSolde);

        infoCompteType.setBounds(100,155,160,30);
        add(infoCompteType);

        infoCompteBanque.setBounds(100,205,160,30);
        add(infoCompteBanque);

        comboComptes.setBounds(100,55,160,30);
        add(comboComptes);

        btnOperation.setBounds(10,260,155,35);
        add(btnOperation);

        btnHistOperation.setBounds(170,260,160,35);
        add(btnHistOperation);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public JLabel getLabelNomPrenom() {
        return labelNomPrenom;
    }

    public void setLabelNomPrenom(JLabel labelNomPrenom) {
        this.labelNomPrenom = labelNomPrenom;
    }

    public JLabel getLabelCompte() {
        return labelCompte;
    }

    public void setLabelCompte(JLabel labelCompte) {
        this.labelCompte = labelCompte;
    }

    public JLabel getLabelSolde() {
        return labelSolde;
    }

    public void setLabelSolde(JLabel labelSolde) {
        this.labelSolde = labelSolde;
    }

    public JLabel getLabelType() {
        return labelType;
    }

    public void setLabelType(JLabel labelType) {
        this.labelType = labelType;
    }

    public JLabel getLabelNomBanque() {
        return labelNomBanque;
    }

    public void setLabelNomBanque(JLabel labelNomBanque) {
        this.labelNomBanque = labelNomBanque;
    }

    public JLabel getInfoCompteSolde() {
        return infoCompteSolde;
    }

    public void setInfoCompteSolde(JLabel infoCompteSolde) {
        this.infoCompteSolde = infoCompteSolde;
    }

    public JLabel getInfoCompteType() {
        return infoCompteType;
    }

    public void setInfoCompteType(JLabel infoCompteType) {
        this.infoCompteType = infoCompteType;
    }

    public JLabel getInfoCompteBanque() {
        return infoCompteBanque;
    }

    public void setInfoCompteBanque(JLabel infoCompteBanque) {
        this.infoCompteBanque = infoCompteBanque;
    }

    public JComboBox getComboComptes() {
        return comboComptes;
    }

    public void setComboComptes(JComboBox comboComptes) {
        this.comboComptes = comboComptes;
    }

    public JButton getBtnOperation() {
        return btnOperation;
    }

    public void setBtnOperation(JButton btnOperation) {
        this.btnOperation = btnOperation;
    }

    public JButton getBtnHistOperation() {
        return btnHistOperation;
    }

    public void setBtnHistOperation(JButton btnHistOperation) {
        this.btnHistOperation = btnHistOperation;
    }
}
