package boletin24_1;

import java.awt.*;


/**
 *
 * @author ylagorebollar
 */
public class InterfazConPaleta extends javax.swing.JFrame {

    public InterfazConPaleta() {
        initComponents();
        this.setTitle("New User...");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lCreate = new javax.swing.JLabel();
        lUserName = new javax.swing.JLabel();
        lFullName = new javax.swing.JLabel();
        lUserId = new javax.swing.JLabel();
        lGroup = new javax.swing.JLabel();
        lHome = new javax.swing.JLabel();
        lLogin = new javax.swing.JLabel();
        lPass = new javax.swing.JLabel();
        lConf = new javax.swing.JLabel();
        tHome = new javax.swing.JTextField();
        tUserId = new javax.swing.JTextField();
        tFullName = new javax.swing.JTextField();
        tUserName = new javax.swing.JTextField();
        pPass = new javax.swing.JPasswordField();
        pConf = new javax.swing.JPasswordField();
        bOk = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        cGroup = new javax.swing.JComboBox();
        cLogin = new javax.swing.JComboBox();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        lCreate.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lCreate.setText("Create a new user");

        lUserName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lUserName.setText("User Name:");

        lFullName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lFullName.setText("Full Name:");

        lUserId.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lUserId.setText("User ID:");

        lGroup.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lGroup.setText("Group:");

        lHome.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lHome.setText("Home Directory:");

        lLogin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lLogin.setText("Login Shell:");

        lPass.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lPass.setText("Password:");

        lConf.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lConf.setText("Confirm:");

        tHome.setForeground(new java.awt.Color(204, 204, 204));
        tHome.setText("(automatic)");
        tHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tHomeMouseClicked(evt);
            }
        });

        tUserId.setForeground(new java.awt.Color(204, 204, 204));
        tUserId.setText("(automatic)");
        tUserId.setToolTipText("");
        tUserId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tUserIdMouseClicked(evt);
            }
        });

        bOk.setText("OK");

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        cGroup.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "staff" }));

        cLogin.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cLogin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "/bin/ksh" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCreate)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lFullName)
                            .addComponent(lUserName)
                            .addComponent(lUserId)
                            .addComponent(lGroup))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lHome)
                            .addComponent(lLogin)
                            .addComponent(lPass)
                            .addComponent(lConf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pConf, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pPass, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tHome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bOk)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUserName)
                    .addComponent(tUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lFullName))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUserId)
                    .addComponent(tUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lGroup)
                    .addComponent(cGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lHome)
                    .addComponent(tHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLogin)
                    .addComponent(cLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPass)
                    .addComponent(pPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lConf)
                    .addComponent(pConf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancel)
                    .addComponent(bOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tUserIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tUserIdMouseClicked
        tUserId.setText("");
        tUserId.setForeground(Color.BLACK);//Cambia el color de la letra al escribir
    }//GEN-LAST:event_tUserIdMouseClicked

    private void tHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tHomeMouseClicked
        tHome.setText("");
        tHome.setForeground(Color.BLACK);
    }//GEN-LAST:event_tHomeMouseClicked

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bCancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancel;
    private javax.swing.JButton bOk;
    private javax.swing.JComboBox cGroup;
    private javax.swing.JComboBox cLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lConf;
    private javax.swing.JLabel lCreate;
    private javax.swing.JLabel lFullName;
    private javax.swing.JLabel lGroup;
    private javax.swing.JLabel lHome;
    private javax.swing.JLabel lLogin;
    private javax.swing.JLabel lPass;
    private javax.swing.JLabel lUserId;
    private javax.swing.JLabel lUserName;
    private javax.swing.JPasswordField pConf;
    private javax.swing.JPasswordField pPass;
    private javax.swing.JTextField tFullName;
    private javax.swing.JTextField tHome;
    private javax.swing.JTextField tUserId;
    private javax.swing.JTextField tUserName;
    // End of variables declaration//GEN-END:variables
}
