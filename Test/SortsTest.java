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
public class SortsTest {
    
    public SortsTest() {
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
     * Test of Sorts method, of class Sorts.
     */
    @Test
    public void testSorts() {
        System.out.println("Sorts");
        Sorts instance = new Sorts();
        instance.Sorts();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of insertSortN method, of class Sorts.
     */
    @Test
    public void testInsertSortN() {
        System.out.println("insertSortN");
        Sorts instance = new Sorts();
        instance.insertSortN(null);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of selectionSortN method, of class Sorts.
     */
    @Test
    public void testSelectionSortN() {
        System.out.println("selectionSortN");
        Sorts instance = new Sorts();
        instance.selectionSortN(null);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of mergeSortN method, of class Sorts.
     */
    @Test
    public void testMergeSortN() {
        System.out.println("mergeSortN");
        Sorts instance = new Sorts();
        Lista expResult = null;
        Lista result = instance.mergeSortN(null);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of bubbleSortN method, of class Sorts.
     */
    @Test
    public void testBubbleSortN() {
        System.out.println("bubbleSortN");
        Sorts instance = new Sorts();
        instance.bubbleSortN(null);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of quickSortN method, of class Sorts.
     */
    @Test
    public void testQuickSortN() {
        System.out.println("quickSortN");
        Sorts instance = new Sorts();
        instance.quickSortN(null);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
