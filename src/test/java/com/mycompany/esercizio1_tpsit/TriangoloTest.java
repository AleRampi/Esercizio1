/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.esercizio1_tpsit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aless
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }
    
    /**
     * Test of tipologiaTriangolo method, of class Triangolo.
     */
    @Test
    public void testTipologiaTriangolo() {
        double a = 10;
        double b = 10;
        double c = 10;
        System.out.println("tipologiaTriangolo");
        Triangolo instance = new Triangolo(a, b, c);
        String expResult = "Equilatero";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    /**
     * Test of tipologiaTriangolo method, of class Triangolo.
     */
    @Test
    public void testTipologiaTriangolo2() {
        double a = 12;
        double b = 12;
        double c = 10;
        System.out.println("tipologiaTriangolo");
        Triangolo instance = new Triangolo(a, b, c);
        String expResult = "Isoscele";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    /**
     * Test of tipologiaTriangolo method, of class Triangolo.
     */
    @Test
    public void testTipologiaTriangolo3() {
        double a = 13;
        double b = 11;
        double c = 12;
        System.out.println("tipologiaTriangolo");
        Triangolo instance = new Triangolo(a, b, c);
        String expResult = "Scaleno";
        String result = instance.tipologiaTriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    

    /**
     * Test of calcolaPerimetro method, of class Triangolo.
     */
    @Test
    public void testCalcolaPerimetro() {
        double a = 10;
        double b = 15;
        double c = 12;
        System.out.println("calcolaPerimetro");
        Triangolo instance = new Triangolo(a, b, c);
        double expResult = 37.0;
        double result = instance.calcolaPerimetro();
        assertEquals(expResult, result, 37.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of calcolaArea method, of class Triangolo.
     */
    @Test
    public void testCalcolaArea() {
        System.out.println("calcolaArea");
        Triangolo instance = new Triangolo(37, 13, 40);
        double expResult = 240.0;
        double result = instance.calcolaArea();
        assertEquals(expResult, result, 240.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
