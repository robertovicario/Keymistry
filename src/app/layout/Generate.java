package app.layout;

import javax.swing.*;

public class Generate extends JPanel {
    public Generate(JFrame jFrame) {
        initComponents(jFrame);
    }

    public void initComponents(JFrame jFrame) {
        JToolBar jToolBar1 = new JToolBar();
        JToolBar jToolBar2 = new JToolBar();
        JLabel jLabel1 = new JLabel();
        Box.Filler filler1 = new Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        Box.Filler filler2 = new Box.Filler(new java.awt.Dimension(0, 8), new java.awt.Dimension(0, 8), new java.awt.Dimension(32767, 8));
        JToolBar jToolBar3 = new JToolBar();
        JLabel jLabel2 = new JLabel();
        Box.Filler filler3 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        JProgressBar jProgressBar1 = new JProgressBar();
        JSeparator jSeparator1 = new JSeparator();
        JToolBar jToolBar4 = new JToolBar();
        JToolBar jToolBar5 = new JToolBar();
        JLabel jLabel3 = new JLabel();
        Box.Filler filler4 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        JSlider jSlider1 = new JSlider();
        Box.Filler filler5 = new Box.Filler(new java.awt.Dimension(0, 8), new java.awt.Dimension(0, 8), new java.awt.Dimension(32767, 8));
        JToolBar jToolBar6 = new JToolBar();
        JCheckBox jCheckBox1 = new JCheckBox();
        Box.Filler filler6 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        JCheckBox jCheckBox2 = new JCheckBox();
        Box.Filler filler7 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        JCheckBox jCheckBox3 = new JCheckBox();
        Box.Filler filler8 = new Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        Box.Filler filler9 = new Box.Filler(new java.awt.Dimension(0, 8), new java.awt.Dimension(0, 8), new java.awt.Dimension(32767, 8));
        JToolBar jToolBar7 = new JToolBar();
        JCheckBox jCheckBox4 = new JCheckBox();
        Box.Filler filler10 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        JCheckBox jCheckBox5 = new JCheckBox();
        Box.Filler filler11 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        JCheckBox jCheckBox6 = new JCheckBox();
        Box.Filler filler12 = new Box.Filler(new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 0), new java.awt.Dimension(24, 32767));
        JCheckBox jCheckBox7 = new JCheckBox();
        Box.Filler filler14 = new Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        jToolBar1.setOrientation(SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        jToolBar2.setRollover(true);

        jLabel1.setText("PASSWORD");
        jToolBar2.add(jLabel1);
        jToolBar2.add(filler1);

        jButton1.setText("Copy");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jButton1);

        jButton2.setText("Generate");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jButton2);

        jToolBar1.add(jToolBar2);
        jToolBar1.add(filler2);

        jToolBar3.setRollover(true);

        jLabel2.setText("Strength:");
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

        jCheckBox1.setText("All characters");
        jCheckBox1.setFocusable(false);
        jCheckBox1.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox1.setVerticalTextPosition(SwingConstants.BOTTOM);
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
        jToolBar7.add(jCheckBox4);
        jToolBar7.add(filler10);

        jCheckBox5.setText("Uppercase");
        jCheckBox5.setFocusable(false);
        jCheckBox5.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox5.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar7.add(jCheckBox5);
        jToolBar7.add(filler11);

        jCheckBox6.setText("Numbers");
        jCheckBox6.setFocusable(false);
        jCheckBox6.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox6.setVerticalTextPosition(SwingConstants.BOTTOM);
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
}
