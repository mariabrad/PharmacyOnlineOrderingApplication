
package TestOrdersManager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import junit.framework.*;
import src.main.java.CheckStock.CheckStock;

import static org.junit.Assert.assertNotNull;

public class TestOrder extends TestCase {
    
    @Test
    public void testConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials?useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest","root","M!lkdrink");
            assertTrue(con1.prepareStatement("select * from orders").executeQuery().next());
           
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestOrder.class.getName()).log(Level.SEVERE, null, ex);
      
        } catch (SQLException ex) {
            Logger.getLogger(TestOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Test
    public void testPageA(){
        CheckStock p=new CheckStock();
        assertNotNull(p);
    }
}
