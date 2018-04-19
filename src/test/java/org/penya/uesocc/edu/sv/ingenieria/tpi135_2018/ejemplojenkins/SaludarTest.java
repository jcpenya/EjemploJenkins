/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.penya.uesocc.edu.sv.ingenieria.tpi135_2018.ejemplojenkins;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jcpenya
 */
public class SaludarTest {
    
    public SaludarTest() {
    }

    @Test
    public void testSpanish() {
        System.out.println("spanish");
        String nombre = "Eduardo";
        Saludar instance = new Saludar();
        String expResult = "Hola Eduardo";
        String result = instance.spanish(nombre);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEnglish() {
        System.out.println("english");
        String name = "Edward";
        Saludar instance = new Saludar();
        String expResult = "Hello Edward";
        String result = instance.english(name);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
