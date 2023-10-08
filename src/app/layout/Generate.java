package app.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.Random;

public class Generate extends JPanel {
    private final JLabel jLabel1 = new JLabel();
    private final JButton jButton1 = new JButton();
    private final JButton jButton2 = new JButton();
    private final JLabel jLabel2 = new JLabel();
    private final JProgressBar jProgressBar1 = new JProgressBar();
    private final JLabel jLabel3 = new JLabel();
    private final JSlider jSlider1 = new JSlider();
    private final JCheckBox jCheckBox1 = new JCheckBox();
    private final JCheckBox jCheckBox2 = new JCheckBox();
    private final JCheckBox jCheckBox3 = new JCheckBox();
    private final JCheckBox jCheckBox4 = new JCheckBox();

    public Generate(JFrame jFrame) {
        initComponents(jFrame);
        initEvents();
    }

    public void initComponents(JFrame jFrame) {
        JToolBar jToolBar1 = new JToolBar();
        JLabel jLabel1 = new JLabel();
        Box.Filler filler1 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JLabel jLabel2 = new JLabel();
        JProgressBar jProgressBar1 = new JProgressBar();
        JSeparator jSeparator1 = new JSeparator();
        JLabel jLabel3 = new JLabel();
        JSlider jSlider1 = new JSlider();
        JToolBar jToolBar2 = new JToolBar();
        JCheckBox jCheckBox1 = new JCheckBox();
        Box.Filler filler2 = new Box.Filler(new Dimension(24, 0), new Dimension(24, 0), new Dimension(24, 32767));
        JCheckBox jCheckBox2 = new JCheckBox();
        Box.Filler filler3 = new Box.Filler(new Dimension(24, 0), new Dimension(24, 0), new Dimension(24, 32767));
        JCheckBox jCheckBox3 = new JCheckBox();
        Box.Filler filler4 = new Box.Filler(new Dimension(24, 0), new Dimension(24, 0), new Dimension(24, 32767));
        JCheckBox jCheckBox4 = new JCheckBox();
        Box.Filler filler5 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));

        jToolBar1.setRollover(true);

        jLabel1.setFont(new Font("",
                Font.BOLD, 20));
        jLabel1.setText("sfjanuisnfcakcunsacksjna");
        jToolBar1.add(jLabel1);
        jToolBar1.add(filler1);

        jButton1.setText("Generate");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        jButton2.setText("Copy");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jLabel2.setFont(new Font("",
                Font.ITALIC, 13));
        jLabel2.setText("STRENGTH");

        jProgressBar1.setStringPainted(true);

        jLabel3.setFont(new Font("",
                Font.ITALIC, 13));
        jLabel3.setText("LENGTH");

        jSlider1.setMajorTickSpacing(31);
        jSlider1.setMaximum(32);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(12);

        jToolBar2.setRollover(true);

        jCheckBox1.setText("Lowercase");
        jCheckBox1.setFocusable(false);
        jCheckBox1.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox1);
        jToolBar2.add(filler2);

        jCheckBox2.setText("Uppercase");
        jCheckBox2.setFocusable(false);
        jCheckBox2.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox2);
        jToolBar2.add(filler3);

        jCheckBox3.setText("Numbers");
        jCheckBox3.setFocusable(false);
        jCheckBox3.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox3.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox3);
        jToolBar2.add(filler4);

        jCheckBox4.setText("Symbols");
        jCheckBox4.setFocusable(false);
        jCheckBox4.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox4.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox4);
        jToolBar2.add(filler5);

        GroupLayout layout = new GroupLayout(jFrame.getContentPane());
        jFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jToolBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jProgressBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addComponent(jSlider1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jToolBar2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToolBar1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jProgressBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToolBar2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    public void initEvents() {
        jButton1.addActionListener(e -> {
            boolean useLowercase = jCheckBox1.isSelected();
            boolean useUppercase = jCheckBox2.isSelected();
            boolean useNumbers = jCheckBox3.isSelected();
            boolean useSymbols = jCheckBox4.isSelected();
            int length = jProgressBar1.getValue();
            generatePassword(useLowercase, useUppercase, useNumbers, useSymbols, length);
            computeComplexity(length);
        });
        jButton2.addActionListener(e -> {
            String text = jLabel1.getText();
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text), null);
        });
        jSlider1.addChangeListener(e -> {
            int value = jSlider1.getValue();
            jLabel3.setText("Length: " + value);
        });
    }

    public void generatePassword(boolean useLowercase, boolean useUppercase, boolean useNumbers, boolean useSymbols, int length) {
        String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
        String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String NUMBER_CHARS = "0123456789";
        String SYMBOL_CHARS = "!@#$%^&*()_+-=[]{}|;:,.<>?";
        Random random = new Random();
        StringBuilder charSet = new StringBuilder();

        if (useSymbols) {
            charSet.append(SYMBOL_CHARS);
        }
        if (useLowercase) {
            charSet.append(LOWERCASE_CHARS);
        }
        if (useUppercase) {
            charSet.append(UPPERCASE_CHARS);
        }
        if (useNumbers) {
            charSet.append(NUMBER_CHARS);
        }

        StringBuilder generatedPassword = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charSet.length());
            generatedPassword.append(charSet.charAt(randomIndex));
        }

        jLabel1.setText(generatedPassword.toString());
    }

    private void setComplexity(String strength, String timeToCrack, Color color, int progressBarValue) {
        jLabel2.setText("Strength: " + strength + " - Time to crack: " + timeToCrack);
        jProgressBar1.setValue(progressBarValue);
        jProgressBar1.setForeground(color);
    }

    private void computeComplexity(int length) {
        if (length <= 3) {
            setComplexity("Very Weak", "Instant", Color.RED, 0);
        } else if (length <= 6) {
            setComplexity("Weak", "Minutes to hours", Color.RED, 25);
        } else if (length <= 8) {
            setComplexity("Moderate", "Hours to days", Color.YELLOW, 50);
        } else if (length <= 10) {
            setComplexity("Strong", "Weeks to months", Color.GREEN, 75);
        } else {
            setComplexity("Very Strong", "Very long time", Color.CYAN, 100);
        }
    }
}
