
package TestPackageManager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestEditeaza {
    
   private static Connection con1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
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
          PreparedStatement insertie=con1.prepareStatement("update produse set descriere=? where id=?");
         insertie.setString (1, "dureri de cap");
         insertie.setInt(2, 7);
      insertie.executeUpdate();
          ResultSet rs;
      rs = insertie.executeQuery("SELECT descriere FROM produse WHERE id=7");
      rs.next(); 
      String g=rs.getString("descriere");

				
				assertEquals("dureri de cap",g);
            } catch (SQLException ex) {
                Logger.getLogger(TestEditeaza.class.getName()).log(Level.SEVERE, null, ex);
            }
                      
	}
        
}