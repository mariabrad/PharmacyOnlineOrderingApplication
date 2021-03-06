
package TestOrdersManager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.Test;
import junit.framework.*;
import src.main.java.CheckStock.CheckStock;
import src.main.java.SearchItem.SearchItem;
import src.main.java.ViewOrders.ViewOrders;

import static org.junit.Assert.assertNotNull;

public class TestReadOrders extends TestCase {
    
    @Test
    public void testDelete(){
        try {
            int c;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con1 =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials?useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest","root","M!lkdrink");
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
            Logger.getLogger(TestReadOrders.class.getName()).log(Level.SEVERE, null, ex);
      
        } catch (SQLException ex) {
            Logger.getLogger(TestReadOrders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Test
    public void testPageA(){
        ViewOrders p=new ViewOrders();
        assertNotNull(p);
    }
    @Test
    public void testPageB(){
        SearchItem p=new SearchItem();
        assertNotNull(p);
    }

}
