package vue;

import javax.swing.*;


/**
 * Created by vmoul on 10/01/2017.
 */
public class PanelLogin extends JFrame {

    private JLabel userLabel = new JLabel("Nom");
    private JTextField userText = new JTextField(20);
    private JLabel passwordLabel = new JLabel("Mot de passe");
    private JPasswordField passwordText = new JPasswordField(20);
    private JButton loginButton = new JButton("Connexion");

    public PanelLogin() {
        super();
        initialize();
    }

    private void initialize() {

        setSize(320, 200);
        setLocation(500,280);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userLabel.setBounds(10, 10, 80, 25);
        add(userLabel);

        userText.setBounds(100, 10, 160, 25);
        add(userText);

        passwordLabel.setBounds(10, 40, 80, 25);
        add(passwordLabel);

        passwordText.setBounds(100, 40, 160, 25);
        add(passwordText);

        loginButton.setBounds(160, 80, 100, 25);
        add(loginButton);

        setVisible(true);
    }

    public JLabel getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(JLabel userLabel) {
        this.userLabel = userLabel;
    }

    public JTextField getUserText() {
        return userText;
    }

    public void setUserText(JTextField userText) {
        this.userText = userText;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JPasswordField getPasswordText() {
        return passwordText;
    }

    public void setPasswordText(JPasswordField passwordText) {
        this.passwordText = passwordText;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }
}