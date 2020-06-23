/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.ManagerPage;

import src.main.java.CheckStock.CheckStock;
import src.main.java.DeleteItem.DeleteItem;
import src.main.java.ManageProducts.ManageProducts;
import src.main.java.ManageRequests.ManageRequests;
import src.main.java.SearchItem.SearchItem;
import src.main.java.ViewOrders.ViewOrders;

/**
 *
 * @author Maria
 */
public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    public Manager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        managerequests = new javax.swing.JButton();
        manageproducts = new javax.swing.JButton();
        vieworders = new javax.swing.JButton();
        searchitem = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        checkstock = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e881bba87734db35285d04ea1ddec35f - Copy.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 400));
        setMinimumSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Manager's Page");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(226, 25, 197, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e881bba87734db35285d04ea1ddec35f - Copy.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 140, 150);

        managerequests.setText("Manage requests");
        managerequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerequestsActionPerformed(evt);
            }
        });
        jPanel1.add(managerequests);
        managerequests.setBounds(542, 239, 174, 23);

        manageproducts.setText("Manage products");
        manageproducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageproductsActionPerformed(evt);
            }
        });
        jPanel1.add(manageproducts);
        manageproducts.setBounds(542, 168, 174, 23);

        vieworders.setText("View orders");
        vieworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewordersActionPerformed(evt);
            }
        });
        jPanel1.add(vieworders);
        vieworders.setBounds(213, 168, 174, 23);

        searchitem.setText("Search item");
        searchitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchitemActionPerformed(evt);
            }
        });
        jPanel1.add(searchitem);
        searchitem.setBounds(213, 239, 174, 23);

        delete.setText("Delete product");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(213, 296, 174, 23);

        checkstock.setText("Check stock");
        checkstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkstockActionPerformed(evt);
            }
        });
        jPanel1.add(checkstock);
        checkstock.setBounds(542, 296, 174, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.jpg"))); // NOI18N
        jLabel2.setText(" ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1160, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 801, 406);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void managerequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerequestsActionPerformed
        ManageRequests m= new ManageRequests();
        this.setVisible(false);
        m.setVisible(true);
              
    }//GEN-LAST:event_managerequestsActionPerformed

    private void manageproductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageproductsActionPerformed
        // TODO add your handling code here:
         ManageProducts m= new ManageProducts();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_manageproductsActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DeleteItem m= new DeleteItem();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_deleteActionPerformed

    private void searchitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchitemActionPerformed
        // TODO add your handling code here:
         SearchItem m= new SearchItem();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_searchitemActionPerformed

    private void viewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewordersActionPerformed
        // TODO add your handling code here:
          ViewOrders m= new ViewOrders();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_viewordersActionPerformed

    private void checkstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkstockActionPerformed
        // TODO add your handling code here:
          CheckStock m= new CheckStock();
        this.setVisible(false);
        m.setVisible(true);
    }//GEN-LAST:event_checkstockActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkstock;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manageproducts;
    private javax.swing.JButton managerequests;
    private javax.swing.JButton searchitem;
    private javax.swing.JButton vieworders;
    // End of variables declaration//GEN-END:variables
}
