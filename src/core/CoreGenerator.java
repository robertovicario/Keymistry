package core;

import alert.Alert;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author Roberto Vicario
 * @version 1.0
 */
public class CoreGenerator {
    private final JTextField jTextField1;
    private final JLabel jLabel1;
    private final JProgressBar jProgressBar1;
    private final JSlider jSlider1;
    private final JCheckBox jCheckBox1;
    private final JCheckBox jCheckBox2;
    private final JCheckBox jCheckBox3;
    private final JCheckBox jCheckBox4;

    public CoreGenerator(JTextField jTextField1, JLabel jLabel1, JProgressBar jProgressBar1, JSlider jSlider1, JCheckBox jCheckBox1, JCheckBox jCheckBox2, JCheckBox jCheckBox3, JCheckBox jCheckBox4) {
        this.jTextField1 = jTextField1;
        this.jLabel1 = jLabel1;
        this.jProgressBar1 = jProgressBar1;
        this.jSlider1 = jSlider1;
        this.jCheckBox1 = jCheckBox1;
        this.jCheckBox2 = jCheckBox2;
        this.jCheckBox3 = jCheckBox3;
        this.jCheckBox4 = jCheckBox4;
    }

    public void generatePassword() {
        String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
        String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String NUMBER_CHARS = "0123456789";
        String SYMBOL_CHARS = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        Random random = new Random();
        StringBuilder charSet = new StringBuilder();

        boolean useLowercase = jCheckBox1.isSelected();
        boolean useUppercase = jCheckBox2.isSelected();
        boolean useNumbers = jCheckBox3.isSelected();
        boolean useSymbols = jCheckBox4.isSelected();

        if (useLowercase) {
            charSet.append(LOWERCASE_CHARS);
        }
        if (useUppercase) {
            charSet.append(UPPERCASE_CHARS);
        }
        if (useNumbers) {
            charSet.append(NUMBER_CHARS);
        }
        if (useSymbols) {
            charSet.append(SYMBOL_CHARS);
        }

        int length = jSlider1.getValue();
        StringBuilder generatedPassword = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charSet.length());
            generatedPassword.append(charSet.charAt(randomIndex));
        }

        String password = generatedPassword.toString();
        jTextField1.setText(password);
    }

    private void computeComplexity(String password, int length) {
        Set<String> veryWeakPasswords = new HashSet<>(Arrays.asList(
                "123456", "123456789", "12345", "qwerty", "password",
                "12345678", "111111", "123123", "1234567890", "1234567",
                "qwerty123", "000000", "1q2w3e", "aa12345678", "abc123",
                "password1", "1234", "qwertyuiop", "123321", "password123"
        ));

        String complexity;
        String timeToCrack;
        Color color;
        int strength;

        if (veryWeakPasswords.contains(password.toLowerCase())) {
            complexity = "Very Weak";
            timeToCrack = "Instant";
            color = Color.RED;
            strength = 0;
        } else if (length < 4) {
            complexity = "Very Weak";
            timeToCrack = "Instant";
            color = Color.RED;
            strength = 0;
        } else if (length < 8) {
            complexity = "Weak";
            timeToCrack = "Minutes to hours";
            color = Color.RED;
            strength = 25;
        } else if (length < 10) {
            complexity = "Moderate";
            timeToCrack = "Hours to days";
            color = Color.YELLOW;
            strength = 50;
        } else if (length < 12) {
            complexity = "Strong";
            timeToCrack = "Weeks to months";
            color = Color.GREEN;
            strength = 75;
        } else {
            complexity = "Very Strong";
            timeToCrack = "Very long time";
            color = Color.CYAN;
            strength = 100;
        }

        jLabel1.setText("Strength: " + complexity + " - Time to crack: " + timeToCrack);
        jProgressBar1.setValue(strength);
        jProgressBar1.setForeground(color);
    }

    public void customizePassword() {
        String password = jTextField1.getText();
        int length = jTextField1.getText().length();

        computeComplexity(password, length);
    }

    private void setCheckBoxForeground(Color color) {
        jCheckBox1.setForeground(color);
        jCheckBox2.setForeground(color);
        jCheckBox3.setForeground(color);
        jCheckBox4.setForeground(color);
    }

    public void mainThread() {
        boolean useLowercase = jCheckBox1.isSelected();
        boolean useUppercase = jCheckBox2.isSelected();
        boolean useNumbers = jCheckBox3.isSelected();
        boolean useSymbols = jCheckBox4.isSelected();

        setCheckBoxForeground(UIManager.getColor("JCheckBox.foreground"));

        if (!useLowercase && !useUppercase && !useNumbers && !useSymbols) {
            setCheckBoxForeground(Color.RED);
            new Alert("Please, select at least one option to generate a password.");
        } else {
            generatePassword();

            String password = jTextField1.getText();
            int length = jTextField1.getText().length();

            computeComplexity(password, length);
        }
    }
}
