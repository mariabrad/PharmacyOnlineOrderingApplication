
package TestOrders;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;

public class testOrder extends TestCase {
    
    @Test
    public void testConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
            assertTrue(con1.prepareStatement("select * from orders").executeQuery().next());
           
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testOrder.class.getName()).log(Level.SEVERE, null, ex);
      
        } catch (SQLException ex) {
            Logger.getLogger(testOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
