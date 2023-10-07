package errors;

import javax.swing.*;

/**
 *
 *
 * @author Roberto Vicario
 * @version 1.0
 */
public class CoreException extends RuntimeException {
    public CoreException(String e) {
        JOptionPane.showMessageDialog(null, e, getClass().toString(), JOptionPane.ERROR_MESSAGE);
    }
}
