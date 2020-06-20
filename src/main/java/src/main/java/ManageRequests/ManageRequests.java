
package src.main.java.ManageRequests;

import ManagerPage.Manager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maria
 */
public class ManageRequests extends javax.swing.JFrame {

    /**
     * Creates new form ManageRequests
     */
    public ManageRequests() {
        initComponents();
        table_update();
        
    }
    
Connection con1;
         PreparedStatement insertie;
         private void table_update()
         {
             int c;
                 try {
            Class.forName("com.mysql.jdbc.Driver");
            con1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
            insertie=con1.prepareStatement("select * from orders");
            ResultSet rs=insertie.executeQuery();
          ResultSetMetaData Rss=rs.getMetaData();
          c=Rss.getColumnCount();
          DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
          Df.setRowCount(0);
          while(rs.next())
          {
              Vector v2=new Vector();
              for (int a=1;a<=c;a++)
              {
                  v2.add(rs.getString("id"));
                  v2.add(rs.getString("name"));
                  v2.add(rs.getString("status"));
                  v2.add(rs.getFloat("sum"));
               
              }
              Df.addRow(v2);
          }
           
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageRequests.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
                
         }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsum = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 18)); // NOI18N
        jLabel1.setText("Manage Requests");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(218, 11, 183, 42);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e881bba87734db35285d04ea1ddec35f - Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 11, 140, 150);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "status", "sum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(419, 11, 320, 290);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 204, 153))); // NOI18N

        txtname.setText(" ");

        jLabel3.setText("Name");

        jLabel4.setText("Status");

        txtstatus.setText(" ");

        jLabel5.setText("Sum");

        txtsum.setText(" ");

        jButton3.setText("Approve");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Reject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(txtstatus)
                    .addComponent(txtsum))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton3)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 80, 230, 220);
        jPanel1.getAccessibleContext().setAccessibleName("Requests");

        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 280, 104, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.jpg"))); // NOI18N
        jLabel7.setText(" ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-10, 0, 1160, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
         int selectedIndex=jTable1.getSelectedRow();
         try {
             int id= Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
             String nume=txtname.getText();
              String status="Rejected";
               String sum=txtsum.getText();
          
             
                  Class.forName("com.mysql.jdbc.Driver");
            con1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
            insertie=con1.prepareStatement("update orders set name=?,status=?,sum=? where id=?");
            
  
            insertie.setString(1,nume);
            insertie.setString(2,status);
            insertie.setString(3,sum);
         
              insertie.setInt(4,id);
            insertie.executeUpdate();
            JOptionPane.showMessageDialog(this,"S-a updatat inregistrarea");
            table_update();
            txtname.setText("");
             txtstatus.setText("");
              txtsum.setText("");
         
              txtname.requestFocus();
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageRequests.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
         int selectedIndex=jTable1.getSelectedRow();
         try {
             int id= Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
             String nume=txtname.getText();
              String status="Approved";
               String sum=txtsum.getText();
          
             
                  Class.forName("com.mysql.jdbc.Driver");
            con1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
            insertie=con1.prepareStatement("update orders set name=?,status=?,sum=? where id=?");
            
  
            insertie.setString(1,nume);
            insertie.setString(2,status);
            insertie.setString(3,sum);
         
              insertie.setInt(4,id);
            insertie.executeUpdate();
            JOptionPane.showMessageDialog(this,"S-a updatat inregistrarea");
            table_update();
            txtname.setText("");
             txtstatus.setText("");
              txtsum.setText("");
         
              txtname.requestFocus();
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageRequests.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManageRequests.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
  DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
         int selectedIndex=jTable1.getSelectedRow();
         txtname.setText(Df.getValueAt(selectedIndex,1).toString());
         txtstatus.setText(Df.getValueAt(selectedIndex,2).toString());
         txtsum.setText(Df.getValueAt(selectedIndex,3).toString());
                 // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Manager m=new Manager();
      this.setVisible(false);
        m.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRequests().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txtsum;
    // End of variables declaration//GEN-END:variables
}
