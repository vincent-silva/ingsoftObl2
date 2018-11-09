/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mjpla
 */
public class MascotaTest {
    
    public MascotaTest() {
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
     * Test of getNombre method, of class Mascota.
     */
    @Test
    public void testGetNombre() {
        
        Mascota instanciaMascota = new Mascota();
        String expResult = "";
        String result = instanciaMascota.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Mascota.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nomnbre = "";
        Mascota instance = new Mascota();
        instance.setNombre(nomnbre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltura method, of class Mascota.
     */
    @Test
    public void testGetAltura() {
        System.out.println("getAltura");
        Mascota instance = new Mascota();
        float expResult = 0.0F;
        float result = instance.getAltura();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltura method, of class Mascota.
     */
    @Test
    public void testSetAltura() {
        System.out.println("setAltura");
        float altura = 0.0F;
        Mascota instance = new Mascota();
        instance.setAltura(altura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPeso method, of class Mascota.
     */
    @Test
    public void testGetPeso() {
        System.out.println("getPeso");
        Mascota instance = new Mascota();
        float expResult = 0.0F;
        float result = instance.getPeso();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPeso method, of class Mascota.
     */
    @Test
    public void testSetPeso() {
        System.out.println("setPeso");
        float peso = 0.0F;
        Mascota instance = new Mascota();
        instance.setPeso(peso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComentarios method, of class Mascota.
     */
    @Test
    public void testGetComentarios() {
        System.out.println("getComentarios");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getComentarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComentarios method, of class Mascota.
     */
    @Test
    public void testSetComentarios() {
        System.out.println("setComentarios");
        String comentarios = "";
        Mascota instance = new Mascota();
        instance.setComentarios(comentarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagen method, of class Mascota.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Mascota instance = new Mascota();
        String expResult = "";
        String result = instance.getImagen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagen method, of class Mascota.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        String imagen = "";
        Mascota instance = new Mascota();
        instance.setImagen(imagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Mascota.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Mascota instance = new Mascota();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
