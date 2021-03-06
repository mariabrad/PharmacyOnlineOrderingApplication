/*

 */
package src.main.java.log;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import src.main.java.ManagerPage.Manager;

/**
 *
 * @author mariabrad
 */
public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(151, 184, 216));
        jButton1.setText("Log in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 320, 130, 29);

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword);
        jPassword.setBounds(330, 220, 190, 26);
        getContentPane().add(jText);
        jText.setBounds(330, 180, 190, 26);

        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 170, 80, 40);

        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 210, 70, 40);

        jLabel4.setFont(new java.awt.Font("Luminari", 0, 36)); // NOI18N
        jLabel4.setText("Pharmacy Online Ordering Application");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 0, 700, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(Login.class.getResource("/colorful-capsule-pills-on-white-background-pharmaceutical-artinun-prekmoung.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(800, 400));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String password=String.valueOf(jPassword.getPassword());
       HashPassword pass=new HashPassword(password);
        password=pass.encrypt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection connection =DriverManager.getConnection("jdbc:mysql://localhost/Credentials?useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest","root","M!lkdrink");
             PreparedStatement ps = connection.prepareStatement("SELECT `username`, `password`, `role` FROM `tabel` WHERE `username` = ? AND `password` = ?");
            ps.setString(1, jText.getText());
            ps.setString(2, password);
            ResultSet result = ps.executeQuery();
            if(result.next()){
         
                String role=result.getString("role");
                PasswordCompare p=new PasswordCompare(role,"a");
                 if(p.compare()){
                     Manager hme=new Manager();
                     this.setVisible(false);
                     hme.setVisible(true);
                     
                 }
                 else{
                     
                     Home hme=new Home();
                     this.setVisible(false);
                     hme.setVisible(true);
                     
                 }
            }
            else{
              JOptionPane.showMessageDialog(this,"Wrong credentials!");
                
            }
             } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
      
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed


    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jText;

}
