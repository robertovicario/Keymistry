package app.layout;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    public App() {
        initComponents();
    }

    private void initComponents() {
        JTabbedPane jTabbedPane1 = new JTabbedPane();
        jTabbedPane1.addTab("Overview", new Overview(this));
        jTabbedPane1.addTab("Generate", new Generate(this));

        setTitle("PassWorld");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(700, 525));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
