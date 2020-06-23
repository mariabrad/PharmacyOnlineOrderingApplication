/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackageManager;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import src.main.java.CheckStock.CheckStock;
import src.main.java.ManageProducts.ManageProducts;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestAdauga {
    
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
				int before=0;
				String sql = "SELECT * FROM produse";
				PreparedStatement p=con1.prepareStatement(sql);
				ResultSet rs = p.executeQuery();
				while(rs.next())
					before++;
                    String nume="algocalmin";
        String descriere="pentru dureri";
         String expirare="2022";
           String prescriptie="1";
        String ingredient="aaa";
         String pret="12";
         String cantitate="13";
	   con1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/Credentials","root","M!lkdrink");
          PreparedStatement  insertie=con1.prepareStatement("insert into produse(nume,descriere,expirare,prescriptie,ingredient,pret,cantitate)values(?,?,?,?,?,?,?)");
              insertie.setString(1,nume);
            insertie.setString(2,descriere);
            insertie.setString(3,expirare);
             insertie.setString(4,prescriptie);
              insertie.setString(5,ingredient);
               insertie.setString(6,pret);
                insertie.setString(7,cantitate);
           int nr= insertie.executeUpdate();
				
				assertNotEquals(before,nr);
			} catch (SQLException e) {
				e.printStackTrace();
			}
                      
	}
	@Test
	public void testPageA(){
		ManageProducts p=new ManageProducts();
		assertNotNull(p);
	}

}