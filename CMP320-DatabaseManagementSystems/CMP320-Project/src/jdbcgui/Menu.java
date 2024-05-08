/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcgui;

/**
 *
 * @author wissam
 */
public class Menu extends javax.swing.JFrame {
LoginUser userloggedin;
    /**
     * Creates new form Menu
     */
    public Menu(LoginUser user) {
        initComponents();
        this.setLocationRelativeTo(null);
        userloggedin = user;
        // disable loginuser if user is not admin
if(user.Type==1){
    LoginUsers.setVisible(false);
}
    }
 public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuQuery = new javax.swing.JMenu();
        jMenuItemJoin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItemDisplayCustomers = new javax.swing.JMenuItem();
        Department = new javax.swing.JMenu();
        jMenuItemAddStores = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItemDisplayStores = new javax.swing.JMenuItem();
        jMenuWatchStock = new javax.swing.JMenu();
        jMenuItemAddWS = new javax.swing.JMenuItem();
        jMenuItemUpdDelWS = new javax.swing.JMenuItem();
        jMenuItemDisplayWS = new javax.swing.JMenuItem();
        LoginUsers = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        UpdDltloginusers = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenuItem9.setText("jMenuItem9");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - JDBC GUI");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbcgui/employees.jpg"))); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbcgui/logout.png"))); // NOI18N
        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jdbcgui/close.png"))); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu9.setText("Orders");
        jMenu9.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jMenuItem12.setText("Add Orders");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        jMenuItem10.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jMenuItem10.setText("Update/Delete Orders");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem10);

        jMenuBar1.add(jMenu9);

        jMenuQuery.setText("Interface");
        jMenuQuery.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        jMenuItemJoin.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jMenuItemJoin.setText("Show UI");
        jMenuItemJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemJoinActionPerformed(evt);
            }
        });
        jMenuQuery.add(jMenuItemJoin);

        jMenuBar1.add(jMenuQuery);

        jMenu2.setText("Customers");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem3.setText("Add New Customers");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem5.setText("Update/Delete Customers");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItemDisplayCustomers.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jMenuItemDisplayCustomers.setText("Display Customers");
        jMenuItemDisplayCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDisplayCustomersActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemDisplayCustomers);

        jMenuBar1.add(jMenu2);

        Department.setText("Stores");
        Department.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItemAddStores.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jMenuItemAddStores.setText("Add Stores");
        jMenuItemAddStores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddStoresActionPerformed(evt);
            }
        });
        Department.add(jMenuItemAddStores);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem4.setText("Update/Delete Stores");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Department.add(jMenuItem4);

        jMenuItemDisplayStores.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jMenuItemDisplayStores.setText("Display Stores");
        jMenuItemDisplayStores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDisplayStoresActionPerformed(evt);
            }
        });
        Department.add(jMenuItemDisplayStores);

        jMenuBar1.add(Department);

        jMenuWatchStock.setText("Watch");
        jMenuWatchStock.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        jMenuItemAddWS.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jMenuItemAddWS.setText("Add Watch");
        jMenuItemAddWS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddWSActionPerformed(evt);
            }
        });
        jMenuWatchStock.add(jMenuItemAddWS);

        jMenuItemUpdDelWS.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jMenuItemUpdDelWS.setText("Update/Delete Watch");
        jMenuItemUpdDelWS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUpdDelWSActionPerformed(evt);
            }
        });
        jMenuWatchStock.add(jMenuItemUpdDelWS);

        jMenuItemDisplayWS.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jMenuItemDisplayWS.setText("Display Watch");
        jMenuItemDisplayWS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDisplayWSActionPerformed(evt);
            }
        });
        jMenuWatchStock.add(jMenuItemDisplayWS);

        jMenuBar1.add(jMenuWatchStock);

        LoginUsers.setText("Users");
        LoginUsers.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LoginUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUsersActionPerformed(evt);
            }
        });

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem6.setText("Add User");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        LoginUsers.add(jMenuItem6);

        UpdDltloginusers.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        UpdDltloginusers.setText("Update/Delete Users");
        UpdDltloginusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdDltloginusersActionPerformed(evt);
            }
        });
        LoginUsers.add(UpdDltloginusers);

        jMenuBar1.add(LoginUsers);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        (new AddCustomers()).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        (new UpdateDeleteCustomers()).setVisible(true);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        (new LoginForm()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
   (new AddLoginUser()).setVisible(true);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void UpdDltloginusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdDltloginusersActionPerformed
        // TODO add your handling code here:
   (new UpdateDeleteLoginUser()).setVisible(true);

    }//GEN-LAST:event_UpdDltloginusersActionPerformed

    private void LoginUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUsersActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_LoginUsersActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        (new UpdateDeleteStores()).setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItemDisplayCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDisplayCustomersActionPerformed
        // TODO add your handling code here:
         (new DisplayCustomers()).setVisible(true);
    }//GEN-LAST:event_jMenuItemDisplayCustomersActionPerformed

    private void jMenuItemUpdDelWSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUpdDelWSActionPerformed
         (new UpdateDeleteWS()).setVisible(true);
    }//GEN-LAST:event_jMenuItemUpdDelWSActionPerformed

    private void jMenuItemDisplayWSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDisplayWSActionPerformed
        // TODO add your handling code here:
        (new DisplayWS()).setVisible(true);
    }//GEN-LAST:event_jMenuItemDisplayWSActionPerformed

    private void jMenuItemDisplayStoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDisplayStoresActionPerformed
        // TODO add your handling code here:
        (new DisplayStores()).setVisible(true);
    }//GEN-LAST:event_jMenuItemDisplayStoresActionPerformed

    private void jMenuItemAddWSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddWSActionPerformed
        // TODO add your handling code here
         (new AddWS()).setVisible(true);
    }//GEN-LAST:event_jMenuItemAddWSActionPerformed

    private void jMenuItemJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemJoinActionPerformed
        // TODO add your handling code here:
        (new Interface()).setVisible(true);
    }//GEN-LAST:event_jMenuItemJoinActionPerformed

    private void jMenuItemAddStoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddStoresActionPerformed
        (new AddStores()).setVisible(true);
    }//GEN-LAST:event_jMenuItemAddStoresActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        (new UpdateDeleteOrder()).setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
         (new AddOrder()).setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Department;
    private javax.swing.JMenu LoginUsers;
    private javax.swing.JMenuItem UpdDltloginusers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemAddStores;
    private javax.swing.JMenuItem jMenuItemAddWS;
    private javax.swing.JMenuItem jMenuItemDisplayCustomers;
    private javax.swing.JMenuItem jMenuItemDisplayStores;
    private javax.swing.JMenuItem jMenuItemDisplayWS;
    private javax.swing.JMenuItem jMenuItemJoin;
    private javax.swing.JMenuItem jMenuItemUpdDelWS;
    private javax.swing.JMenu jMenuQuery;
    private javax.swing.JMenu jMenuWatchStock;
    // End of variables declaration//GEN-END:variables
}