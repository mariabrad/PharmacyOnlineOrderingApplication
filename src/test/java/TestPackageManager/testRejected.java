/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import DeleteItem.DeleteItem;
import ManageProducts.ManageProducts;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class testRejected {
    
   private static Connection con1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con1 = DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		con1.close();
	} 
	
	@Test
	public void approve() {
			try {
				
	   con1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
          PreparedStatement insertie=con1.prepareStatement("update orders set status=? where id=?");
         insertie.setString (1, "Rejected");
         insertie.setInt(2, 1);
      insertie.executeUpdate();
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
          ResultSet rs;
      rs = insertie.executeQuery("SELECT status FROM orders WHERE id=1");
      rs.next(); 
      String g=rs.getString("status");

				
				assertEquals("Approved",g);
            } catch (SQLException ex) {
                Logger.getLogger(DeleteItem.class.getName()).log(Level.SEVERE, null, ex);
            }
                      
	}
        
}