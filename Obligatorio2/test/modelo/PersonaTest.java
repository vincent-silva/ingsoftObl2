/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashSet;
import java.util.Set;
import modelo.Persona;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author vince
 */
public class PersonaTest {
    @Test
    public void testConstructorNombre() {
        System.out.println("PersonaTest - constructorNombre");
        Persona instancia = new Persona();
        
        assertEquals("NN", instancia.getNombre());
    }

    /**
     * Test of setNomnbre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("PersonaTest - setNomnbre");
        Persona instancia = new Persona();
        
        String unNombre = "Nombre";
        instancia.setNombre(unNombre);
        
        assertEquals(unNombre, instancia.getNombre());
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testSetNombreVacio() {
        System.out.println("PersonaTest - SetNombreVacio");
        Persona instancia = new Persona();
        String unNombre = null;
        
        instancia.setNombre(unNombre);
    }
    
    /**
     * Test of equals method, of class Persona.
     */
    @Ignore("Test autogenrado")
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
