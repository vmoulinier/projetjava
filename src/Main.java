import javax.swing.SwingUtilities;
import vue.*;
import controllers.*;


public class Main
{
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PanelLogin panellogin = new PanelLogin();
                ctrlLogin ctrllogin = new ctrlLogin(panellogin);
                ctrllogin.actionlogin();
            }
        });
    }
}
