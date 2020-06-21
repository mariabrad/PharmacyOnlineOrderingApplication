/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testProducts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.*;
import src.main.java.order.Orders;
import src.main.java.products.Checkout;
import src.main.java.products.Prod;
import src.main.java.products.Search;


/**
 *
 * @author mariabrad
 */
public class TestProductPage {

    @Before
    public void setUp() {

    }
    @After
    public void tearDown() {
    }

    @Test
    public void testPage(){
        Prod p=new Prod(null);
        assertNotNull(p);
    }
    @Test
    public void testPageS(){
        Search p=new Search();
        assertNotNull(p);
    }





}
