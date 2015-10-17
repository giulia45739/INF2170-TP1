/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Utilisateur
 */
public class Pep8Test {
    
    public Pep8Test() {
    }

    /**
     * Test of deci method, of class Pep8.
     */
    @Test
    public void testDeci() {
        System.out.println("deci");
        int expResult = 0;
        int result = Pep8.deci();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of deco method, of class Pep8.
     */
    @Test
    public void testDeco() {
        System.out.println("deco");
        int val = 0;
        Pep8.deco(val);
        fail("The test case is a prototype.");
    }

    /**
     * Test of chari method, of class Pep8.
     */
    @Test
    public void testChari() {
        System.out.println("chari");
        char expResult = ' ';
        char result = Pep8.chari();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of charo method, of class Pep8.
     */
    @Test
    public void testCharo() {
        System.out.println("charo");
        char val = ' ';
        Pep8.charo(val);
        fail("The test case is a prototype.");
    }

    /**
     * Test of stro method, of class Pep8.
     */
    @Test
    public void testStro_String() {
        System.out.println("stro");
        String val = "";
        Pep8.stro(val);
        fail("The test case is a prototype.");
    }

    /**
     * Test of stro method, of class Pep8.
     */
    @Test
    public void testStro_charArr() {
        System.out.println("stro");
        char[] val = null;
        Pep8.stro(val);
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class Pep8.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        Pep8.stop();
        fail("The test case is a prototype.");
    }
    
}
