package app.layout;

import core.CoreGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class Generator extends JPanel {
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
    CoreGenerator coreGenerator = new CoreGenerator(jLabel1, jLabel2, jProgressBar1, jCheckBox1, jCheckBox2, jCheckBox3, jCheckBox4, jSlider1);

    public Generator() {
        initComponents();
        initEvents();
        coreGenerator.mainProcess();
    }

    public void initComponents() {
        JPanel jPanel1 = new JPanel();
        JToolBar jToolBar1 = new JToolBar();
        Box.Filler filler1 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));
        JSeparator jSeparator1 = new JSeparator();
        JToolBar jToolBar2 = new JToolBar();
        Box.Filler filler2 = new Box.Filler(new Dimension(24, 0), new Dimension(24, 0), new Dimension(24, 32767));
        Box.Filler filler3 = new Box.Filler(new Dimension(24, 0), new Dimension(24, 0), new Dimension(24, 32767));
        Box.Filler filler4 = new Box.Filler(new Dimension(24, 0), new Dimension(24, 0), new Dimension(24, 32767));
        Box.Filler filler5 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));

        jToolBar1.setRollover(true);

        jLabel1.setFont(new Font("",
                Font.BOLD, 20));
        jLabel1.setText("PASSWORD");
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
        jLabel3.setText("Length: 12");

        jSlider1.setMajorTickSpacing(32);
        jSlider1.setMaximum(32);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(12);

        jToolBar2.setRollover(true);

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Lowercase");
        jCheckBox1.setFocusable(false);
        jCheckBox1.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox1.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox1);
        jToolBar2.add(filler2);

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Uppercase");
        jCheckBox2.setFocusable(false);
        jCheckBox2.setHorizontalTextPosition(SwingConstants.CENTER);
        jCheckBox2.setVerticalTextPosition(SwingConstants.BOTTOM);
        jToolBar2.add(jCheckBox2);
        jToolBar2.add(filler3);

        jCheckBox3.setSelected(true);
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

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jToolBar1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jProgressBar1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1, GroupLayout.Alignment.LEADING)
                                        .addComponent(jSlider1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jToolBar2, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
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

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }

    public void initEvents() {
        jButton1.addActionListener(e -> coreGenerator.mainProcess());
        jButton2.addActionListener(e -> {
            String text = jLabel1.getText();
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(text), null);
        });
        jSlider1.addChangeListener(e -> {
            int value = jSlider1.getValue();
            jLabel3.setText("Length: " + value);

            coreGenerator.mainProcess();
        });
        jCheckBox1.addActionListener(e -> coreGenerator.mainProcess());
        jCheckBox2.addActionListener(e -> coreGenerator.mainProcess());
        jCheckBox3.addActionListener(e -> coreGenerator.mainProcess());
        jCheckBox4.addActionListener(e -> coreGenerator.mainProcess());
    }
}
