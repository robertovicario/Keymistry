package alert;

import javax.swing.*;

/**
 *
 *
 * @author Roberto Vicario
 * @version 1.0
 */
public class Success extends JOptionPane {
    public Success(String msg) {
        showMessageDialog(null, msg, getClass().toString(), JOptionPane.INFORMATION_MESSAGE);
    }
}
