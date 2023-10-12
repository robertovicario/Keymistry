package app.layout;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.*;

import javax.swing.*;
import java.awt.*;

/**
 * @author Roberto Vicario
 * @version 1.0
 */
public class App extends JFrame {
    private final String tab;

    public App(String tab) {
        this.tab = tab;

        try {
            UIManager.setLookAndFeel(new FlatGitHubIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        initComponents();
    }

    private void initComponents() {
        JFrame jFrame = new JFrame();
        JTabbedPane jTabbedPane1 = new JTabbedPane();

        jTabbedPane1.addTab("Overview", new Overview());
        jTabbedPane1.addTab("Generator", new Generator());

        switch (tab) {
            case "Overview":
                jTabbedPane1.setSelectedIndex(0);
                break;
            case "Generator":
                jTabbedPane1.setSelectedIndex(1);
                break;
            default:
                jTabbedPane1.setSelectedIndex(0);
                break;
        }

        GroupLayout layout = new GroupLayout(jFrame.getContentPane());
        jFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addGap(12, 12, 12))
        );

        jFrame.setTitle("Keymistry");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setMinimumSize(new Dimension(700, 525));
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
