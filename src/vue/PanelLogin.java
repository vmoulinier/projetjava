package vue;

import java.awt.event.*;
import javax.swing.*;
import models.Manager;

/**
 * Created by vmoul on 10/01/2017.
 */
public class PanelLogin extends JFrame {

    private JLabel userLabel = new JLabel("Nom");
    private JTextField userText = new JTextField(20);
    private JLabel passwordLabel = new JLabel("Mot de passe");
    private JPasswordField passwordText = new JPasswordField(20);
    private JButton loginButton = new JButton("login");
    private Manager manager = new Manager();


    public PanelLogin() {
        super();
        initialize();
        actionlogin();
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

        loginButton.setBounds(180, 80, 80, 25);
        add(loginButton);
    }

    public void actionlogin(){
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String puname = userText.getText();
                String ppaswd = passwordText.getText();
                if(manager.login(puname, ppaswd) != 0) {
                    manager.getInfosClient(manager.login(puname, ppaswd));
                    PanelClient panelclient = new PanelClient();
                    panelclient.setVisible(true);
                    dispose();
                } else {

                    JOptionPane.showMessageDialog(null,"Mauvais MDP / Nom");
                    userText.setText("");
                    passwordText.setText("");
                    userText.requestFocus();
                }

            }
        });
    }

    public String getNomClient()
    {
        return this.userText.getText();
    }

    public String getPasswordClient()
    {
        return this.passwordLabel.getText();
    }

}