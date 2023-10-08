package alert;

import javax.swing.*;

/**
 * This class allows you to create customized alert dialogs with various options.
 *
 * @author Roberto Vicario
 * @version 1.0
 */
public class Alert extends JOptionPane {
    public Alert(String msg) {
        showMessageDialog(null, msg, getClass().toString(), JOptionPane.ERROR_MESSAGE);
    }
}
