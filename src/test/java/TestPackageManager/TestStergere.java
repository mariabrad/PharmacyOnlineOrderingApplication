/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackageManager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import src.main.java.DeleteItem.DeleteItem;

import static org.junit.Assert.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestStergere  {
    
   private static Connection con1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con1 = DriverManager.getConnection("jdbc:mysql://localhost/Credentials?useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest","root","M!lkdrink");
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		con1.close();
	}

	@Test
	public void addUserTest() {
			try {
				//DeleteItem test=new DeleteItem();
				int before=0,after=0;
			   con1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
          PreparedStatement insertie=con1.prepareStatement("select * from produse");
				ResultSet rs = insertie.executeQuery();
				while(rs.next())
					before++;
                  
	    PreparedStatement insertie2=con1.prepareStatement("delete from produse where id=1");
          

            
           int numRowsChanged= insertie2.executeUpdate();
			
				
				assertNotEquals(before,numRowsChanged);
			
            } catch (SQLException ex) {
				ex.printStackTrace();;
            }
                      
	}
	@Test
	public void testPage(){
		src.main.java.DeleteItem.DeleteItem p=new DeleteItem();
		assertNotNull(p);
	}
        
}