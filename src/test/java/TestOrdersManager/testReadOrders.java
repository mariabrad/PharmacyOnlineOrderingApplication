
package TestOrders;


import TestPackage.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;

public class testReadOrders extends TestCase {
    
    @Test
    public void testDelete(){
        try {
            int c;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
             PreparedStatement insertie;
            insertie=con1.prepareStatement("select * from orders");
            ResultSet rs=insertie.executeQuery();
          ResultSetMetaData Rss=rs.getMetaData();
          rs.next();
          c=Rss.getColumnCount();
       int ok=0;
              Vector v2=new Vector();
             for (int a=1;a<=c;a++)
             { v2.add(rs.getString("id"));
                  v2.add(rs.getString("name"));
                  v2.add(rs.getString("status"));
                  v2.add(rs.getFloat("sum"));
              ok++;
             }
           
           
           assertEquals(ok,c);
            
           
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testReadOrders.class.getName()).log(Level.SEVERE, null, ex);
      
        } catch (SQLException ex) {
            Logger.getLogger(testReadOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
