/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testLogin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;
import src.main.java.log.*;


/**
 *
 * @author mariabrad
 */
public class TestLoginPage {

    @Before
    public void setUp() {

    }
    @After
    public void tearDown() {
    }

    @Test
    public void testPage(){
        Home h=new Home();
        assertNotNull(h);
    }
    @Test
    public void testLogin(){
        Login h=new Login();
        assertNotNull(h);
    }



}
