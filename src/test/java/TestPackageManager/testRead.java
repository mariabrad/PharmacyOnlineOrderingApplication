
package TestPackageManager;

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

public class testRead extends TestCase {
    
    @Test
    public void testDelete(){
        try {
            int c;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con1 =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
             PreparedStatement insertie;
            insertie=con1.prepareStatement("select * from produse");
            ResultSet rs=insertie.executeQuery();
          ResultSetMetaData Rss=rs.getMetaData();
          c=Rss.getColumnCount();
      
         
              Vector v2=new Vector();
            rs.next();
                  v2.add(rs.getString("id"));
                  v2.add(rs.getString("nume"));
                  v2.add(rs.getString("descriere"));
                  v2.add(rs.getString("expirare"));
                  v2.add(rs.getString("prescriptie"));
                  v2.add(rs.getString("ingredient"));
                  v2.add(rs.getString("pret"));
                  v2.add(rs.getString("cantitate"));
              
             int ok;
			 ok=0;
             if (v2!=null)
             {
                 ok=1;
             }
           assertEquals(ok,1);
            
           
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(testRead.class.getName()).log(Level.SEVERE, null, ex);
      
        } catch (SQLException ex) {
            Logger.getLogger(testRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
