
package TestOrdersManager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import junit.framework.*;

public class TestOrder extends TestCase {
    
    @Test
    public void testConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
            assertTrue(con1.prepareStatement("select * from orders").executeQuery().next());
           
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestOrder.class.getName()).log(Level.SEVERE, null, ex);
      
        } catch (SQLException ex) {
            Logger.getLogger(TestOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
