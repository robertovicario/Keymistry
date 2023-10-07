package app.layout;

import alert.Alert;
import alert.Success;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;

public class Generate extends JPanel {
    private JLabel jLabel1 = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JLabel jLabel2 = new JLabel();
    private JProgressBar jProgressBar1 = new JProgressBar();
    private JLabel jLabel3 = new JLabel();
    private JSlider jSlider1 = new JSlider();
    private JCheckBox jCheckBox1 = new JCheckBox();
    private JCheckBox jCheckBox2 = new JCheckBox();
    private JCheckBox jCheckBox3 = new JCheckBox();
    private JCheckBox jCheckBox4 = new JCheckBox();
    private JCheckBox jCheckBox5 = new JCheckBox();
    private JCheckBox jCheckBox6 = new JCheckBox();
    private JCheckBox jCheckBox7 = new JCheckBox();

    public Generate(JFrame jFrame) {
        initComponents(jFrame);
        initEvents();
    }

    public void initComponents(JFrame jFrame) {
        JToolBar jToolBar1 = new JToolBar();
        JToolBar jToolBar2 = new JToolBar();
        Box.Filler filler1 = new Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        Box.Filler filler2 = new Box.Filler(new java.awt.Dimension(0, 8), new java.awt.Dimension(0, 8), new java.awt.Dimension(32767, 8));
        JToolBar jToolBar3 = new JToolBar();
        Box.Filler filler3 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        JSeparator jSeparator1 = new JSeparator();
        JToolBar jToolBar4 = new JToolBar();
        JToolBar jToolBar5 = new JToolBar();
        Box.Filler filler4 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        Box.Filler filler5 = new Box.Filler(new java.awt.Dimension(0, 8), new java.awt.Dimension(0, 8), new java.awt.Dimension(32767, 8));
        JToolBar jToolBar6 = new JToolBar();
        Box.Filler filler6 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        Box.Filler filler7 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        Box.Filler filler8 = new Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        Box.Filler filler9 = new Box.Filler(new java.awt.Dimension(0, 8), new java.awt.Dimension(0, 8), new java.awt.Dimension(32767, 8));
        JToolBar jToolBar7 = new JToolBar();
        Box.Filler filler10 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        Box.Filler filler11 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        Box.Filler filler12 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        Box.Filler filler14 = new Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        jToolBar1.setOrientation(SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        jToolBar2.setRollover(true);

        jLabel1.setText("PASSWORD");
        jToolBar2.add(jLabel1);
        jToolBar2.add(filler1);

        jButton1.setText("Generate");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jButton1);

        jButton2.setText("Copy");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jButton2);

        jToolBar1.add(jToolBar2);
        jToolBar1.add(filler2);

        jToolBar3.setRollover(true);

        jLabel2.setText("Strength: 0%");
        jToolBar3.add(jLabel2);
        jToolBar3.add(filler3);

        jProgressBar1.setValue(0);
        jProgressBar1.setStringPainted(true);
        jToolBar3.add(jProgressBar1);

        jToolBar1.add(jToolBar3);

        jToolBar4.setOrientation(SwingConstants.VERTICAL);
        jToolBar4.setRollover(true);

        jToolBar5.setRollover(true);

        jLabel3.setText("Length: 12");
        jToolBar5.add(jLabel3);
        jToolBar5.add(filler4);

        jSlider1.setMajorTickSpacing(31);
        jSlider1.setMaximum(32);
        jSlider1.setMinimum(1);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(12);
        jToolBar5.add(jSlider1);

        jToolBar4.add(jToolBar5);
        jToolBar4.add(filler5);

        jToolBar6.setBorder(null);
        jToolBar6.setRollover(true);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(jCheckBox1);
        buttonGroup1.add(jCheckBox2);
        buttonGroup1.add(jCheckBox3);

        jCheckBox1.setText("All characters");
        jCheckBox1.setFocusable(false);
        jCheckBox1.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jCheckBox1.setSelected(true);
        jToolBar6.add(jCheckBox1);
        jToolBar6.add(filler6);

        jCheckBox2.setText("Easy-to-say");
        jCheckBox2.setFocusable(false);
        jCheckBox2.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar6.add(jCheckBox2);
        jToolBar6.add(filler7);

        jCheckBox3.setText("Easy-to-read");
        jCheckBox3.setFocusable(false);
        jCheckBox3.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox3.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar6.add(jCheckBox3);
        jToolBar6.add(filler8);

        jToolBar4.add(jToolBar6);
        jToolBar4.add(filler9);

        jToolBar7.setRollover(true);

        jCheckBox4.setText("Lowercase");
        jCheckBox4.setFocusable(false);
        jCheckBox4.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox4.setVerticalTextPosition(SwingConstants.BOTTOM);
        jCheckBox4.setSelected(true);
        jToolBar7.add(jCheckBox4);
        jToolBar7.add(filler10);

        jCheckBox5.setText("Uppercase");
        jCheckBox5.setFocusable(false);
        jCheckBox5.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox5.setVerticalTextPosition(SwingConstants.BOTTOM);
        jCheckBox5.setSelected(true);
        jToolBar7.add(jCheckBox5);
        jToolBar7.add(filler11);

        jCheckBox6.setText("Numbers");
        jCheckBox6.setFocusable(false);
        jCheckBox6.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox6.setVerticalTextPosition(SwingConstants.BOTTOM);
        jCheckBox6.setSelected(true);
        jToolBar7.add(jCheckBox6);
        jToolBar7.add(filler12);

        jCheckBox7.setText("Symbols");
        jCheckBox7.setFocusable(false);
        jCheckBox7.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox7.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar7.add(jCheckBox7);
        jToolBar7.add(filler14);

        jToolBar4.add(jToolBar7);

        GroupLayout layout = new GroupLayout(jFrame.getContentPane());
        jFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jToolBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addComponent(jToolBar4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToolBar1, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToolBar4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    public void initEvents() {
        jButton1.addActionListener(e -> {
            StringBuilder password = new StringBuilder();
            Random random = new Random();
            String lowercaseChars1 = "abcdefghijklmnopqrstuvwxyz";
            String lowercaseChars2 = "abcdefghjkmnpqrstuvwxyz";
            String uppercaseChars1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String uppercaseChars2 = "ABCDEFGHJKLMNPQRSTUVWXYZ";
            String numberChars1 = "0123456789";
            String numberChars2 = "23456789";
            String symbolChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";

            boolean areNotSelected =
                    !jCheckBox4.isSelected() &&
                    !jCheckBox5.isSelected() &&
                    !jCheckBox6.isSelected() &&
                    !jCheckBox7.isSelected();
            if (areNotSelected) {
                jCheckBox4.setForeground(Color.RED);
                jCheckBox5.setForeground(Color.RED);
                jCheckBox6.setForeground(Color.RED);
                jCheckBox7.setForeground(Color.RED);

                new Alert("Please select at least one option to generate a password.");
            }

            if (jCheckBox1.isSelected()) {
                if (jCheckBox4.isSelected()) {
                    password.append(lowercaseChars1);
                }

                if (jCheckBox5.isSelected()) {
                    password.append(uppercaseChars1);
                }

                if (jCheckBox6.isSelected()) {
                    password.append(numberChars1);
                }

                if (jCheckBox7.isSelected()) {
                    password.append(symbolChars);
                }
            } else if (jCheckBox2.isSelected()) {
                if (jCheckBox4.isSelected()) {
                    password.append(lowercaseChars1);
                }

                if (jCheckBox5.isSelected()) {
                    password.append(uppercaseChars1);
                }

                if (jCheckBox6.isSelected()) {
                    jCheckBox6.setSelected(false);
                }

                if (jCheckBox7.isSelected()) {
                    jCheckBox7.setSelected(false);
                }
            } else if (jCheckBox3.isSelected()){
                if (jCheckBox4.isSelected()) {
                    password.append(lowercaseChars2);
                }

                if (jCheckBox5.isSelected()) {
                    password.append(uppercaseChars2);
                }

                if (jCheckBox6.isSelected()) {
                    password.append(numberChars2);
                }

                if (jCheckBox7.isSelected()) {
                    password.append(symbolChars);
                }
            }

            StringBuilder generatedPassword = new StringBuilder();
            int length = jSlider1.getValue();
            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(password.length());
                generatedPassword.append(password.charAt(randomIndex));
            }

            if (!areNotSelected) {
                jCheckBox4.setForeground(Color.BLACK);
                jCheckBox5.setForeground(Color.BLACK);
                jCheckBox6.setForeground(Color.BLACK);
                jCheckBox7.setForeground(Color.BLACK);
            }

            jLabel1.setText(generatedPassword.toString());

            // -- --

            String newPassword = jLabel1.getText();
            int complexity = 0;

            if (length >= 8) {
                complexity += 25;
            } else if (length >= 6) {
                complexity += 10;
            }

            // Check for uppercase letters
            if (newPassword.matches(".*[A-Z].*")) {
                complexity += 25;
            }

            // Check for lowercase letters
            if (newPassword.matches(".*[a-z].*")) {
                complexity += 25;
            }

            // Check for digits
            if (newPassword.matches(".*\\d.*")) {
                complexity += 25;
            }

            // Check for special characters
            if (newPassword.matches(".*[@#$%^&+=].*")) {
                complexity += 25;
            }

            // Ensure the complexity is between 0 and 100%
            complexity = Math.min(100, complexity);
            jLabel2.setText("Strength: " + complexity);
            jProgressBar1.setValue(complexity);
        });
        jButton2.addActionListener(e -> {
            String text = jLabel1.getText();
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection selection = new StringSelection(text);
            clipboard.setContents(selection, null);
        });
        jSlider1.addChangeListener(e -> {
            int value = jSlider1.getValue();
            jLabel3.setText("Length: " + value);
        });
    }
}
