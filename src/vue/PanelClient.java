package vue;
import javax.swing.*;
import models.Client;
import models.Compte;
import models.Manager;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Created by vmoul on 10/01/2017.
 */
public class PanelClient extends JFrame{

    JPanel panel = new JPanel();
    Manager manager = new Manager();

    PanelClient(Client leClient){
        super("Compte client");
        System.out.println(leClient.getMdpClient());
        setSize(350,500);
        setLocation(500,280);
        panel.setLayout (null);

        JLabel welcome = new JLabel(leClient.getNomClient()+" "+leClient.getNomClient());
        welcome.setBounds(10,45,160,30);

        JComboBox comboComptes = new JComboBox();
        comboComptes.setBounds(10,10,160,30);
        comboComptes.removeAllItems();
        comboComptes.insertItemAt("", 0);

        ArrayList<Compte> list = manager.getComptesFromClient(leClient.getCodeClient());
        for(Compte compteClient : list)
        {
            comboComptes.addItem(compteClient.getNumero());
        }

        panel.add(welcome);
        panel.add(comboComptes);
        getContentPane().add(panel);

        comboComptes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                JComboBox comboComptes = (JComboBox) event.getSource();

                System.out.println("toto");
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
