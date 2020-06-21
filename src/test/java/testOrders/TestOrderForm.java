/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testOrders;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;
import src.main.java.order.Orders;


/**
 *
 * @author mariabrad
 */
public class TestOrderForm {

    @Before
    public void setUp() {

    }
    @After
    public void tearDown() {
    }

    @Test
    public void testPage(){
     Orders h=new Orders();
     assertNotNull(h);
    }



}
