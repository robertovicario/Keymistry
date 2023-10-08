package app.layout;

import alert.Alert;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 *
 * @author Roberto Vicario
 * @version 1.0
 */
public class Overview extends JPanel {
    private final JButton jButton1 = new JButton();

    /**
     *
     */
    public Overview() {
        initComponents();
        initEvents();
    }

    /**
     *
     */
    public void initComponents() {
        JPanel jPanel1 = new JPanel();
        JToolBar jToolBar1 = new JToolBar();
        JLabel jLabel1 = new JLabel();
        Box.Filler filler1 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));
        JToolBar jToolBar2 = new JToolBar();
        JLabel jLabel2 = new JLabel();
        Box.Filler filler2 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 32767));

        jToolBar1.setRollover(true);

        jLabel1.setText("Learn more on GitHub: github.com/PassWorld.git");
        jToolBar1.add(jLabel1);
        jToolBar1.add(filler1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Learn more");
        jToolBar1.add(jButton1);

        jToolBar2.setRollover(true);

        ImageIcon icon = new ImageIcon("assets/img/cover.png");
        jLabel2.setIcon(icon);
        jToolBar2.add(jLabel2);
        jToolBar2.add(filler2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }

    /**
     *
     */
    public void initEvents() {
        jButton1.addActionListener(e -> {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/robertovicario/PassWorld.git"));
            } catch (IOException | URISyntaxException ex) {
                new Alert(ex.getMessage());
            }
        });
    }
}
