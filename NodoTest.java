/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marcel
 */
public class NodoTest {
    
    public NodoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNext method, of class Nodo.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        Nodo instance = new Nodo();
        Nodo expResult = null;
        Nodo result = instance.getNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setNext method, of class Nodo.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        Nodo instance = new Nodo();
        instance.setNext(null);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPre method, of class Nodo.
     */
    @Test
    public void testGetPre() {
        System.out.println("getPre");
        Nodo instance = new Nodo();
        Nodo expResult = null;
        Nodo result = instance.getPre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPre method, of class Nodo.
     */
    @Test
    public void testSetPre() {
        System.out.println("setPre");
        Nodo instance = new Nodo();
        instance.setPre(null);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getInfo method, of class Nodo.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        Nodo instance = new Nodo();
        Object expResult = null;
        Object result = instance.getInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setInfo method, of class Nodo.
     */
    @Test
    public void testSetInfo() {
        System.out.println("setInfo");
        Object s = null;
        Nodo instance = new Nodo();
        instance.setInfo(s);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
