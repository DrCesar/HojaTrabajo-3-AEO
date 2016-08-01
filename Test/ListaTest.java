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
public class ListaTest {
    
    public ListaTest() {
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
     * Test of add method, of class Lista.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Object i = null;
        Lista instance = new Lista();
        instance.add(i);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of length method, of class Lista.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        Lista instance = new Lista();
        int expResult = 0;
        int result = instance.length();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getNodo method, of class Lista.
     */
    @Test
    public void testGetNodo() {
        System.out.println("getNodo");
        int i = 0;
        Lista instance = new Lista();
        Nodo expResult = null;
        Nodo result = instance.getNodo(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setNodo method, of class Lista.
     */
    @Test
    public void testSetNodo() {
        System.out.println("setNodo");
        Lista instance = new Lista();
        instance.setNodo(null);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of getRaiz method, of class Lista.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        Lista instance = new Lista();
        Nodo expResult = null;
        Nodo result = instance.getRaiz();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of listToVector method, of class Lista.
     */
    @Test
    public void testListToVector() {
        System.out.println("listToVector");
        Lista instance = new Lista();
        instance.listToVector();
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of swapNodos method, of class Lista.
     */
    @Test
    public void testSwapNodos() {
        System.out.println("swapNodos");
        Lista instance = new Lista();
        instance.swapNodos(null);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of print method, of class Lista.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Lista instance = new Lista();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of selectionSortN method, of class Lista.
     */
    @Test
    public void testSelectionSortN() {
        System.out.println("selectionSortN");
        Lista instance = new Lista();
        instance.selectionSortN();
        // TODO review the generated test code and remove the default call to fail.
  
    }
    
}
