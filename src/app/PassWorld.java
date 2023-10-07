package app;

import com.formdev.flatlaf.FlatLightLaf;

import app.layout.App;

import javax.swing.*;

/**
 * The ToDo class is responsible for launching the application.
 *
 * @author Roberto Vicario
 * @version 1.0
 */
public class PassWorld {
    /**
     * The main method is the entry point of the calculator application.
     *
     * @param args command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e.getMessage());
        }

        new App();
    }
}
