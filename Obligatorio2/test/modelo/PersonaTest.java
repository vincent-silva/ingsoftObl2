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
    private Persona instancia;
    
    @Test
    public void setNombre_normal() {
        instancia = new Persona();
        
        String unNombre = "Nombre";
        instancia.setNombre(unNombre);
        
        assertEquals(unNombre, instancia.getNombre());
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void setNombre_vacio() {
        instancia = new Persona();
        String unNombre = null;
        
        instancia.setNombre(unNombre);
    }
    
    @Test
    public void setEdad_normal() {
        instancia = new Persona();
        int edad = 18;
        
        instancia.setEdad(edad);
        
        assertEquals(edad, instancia.getEdad());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setEdad_vacio() {
        instancia = new Persona();
        Integer edad = null;
        
        instancia.setEdad(edad);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setEdad_conComma() {
        instancia = new Persona();
        float edad = 3.5f;
        
        instancia.setEdad(edad);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setEdad_negativa() {
        instancia = new Persona();
        int edad = -10;
        
        instancia.setEdad(edad);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setEdad_cero(){ 
        instancia = new Persona();
        int edad = 0;
        
        instancia.setEdad(edad);
    }
    
    
    @Test
    public void equals_mismoObjeto() {
        instancia = new Persona();
        boolean resultado = true;
        
        assertEquals(resultado, instancia.equals(instancia));
    }
    
    @Test
    public void equals_nulo() {
        Object obj = null;
        Persona instancia = new Persona();
        boolean resultado = false;
        
        assertEquals(resultado, instancia.equals(obj));        
    }
    
    @Test
    public void equals_diferentesPersonas() {
        Persona instancia1 = new Persona("Nombre Apellido", 40, 'M');
        Persona instancia2 = new Persona("Nombre Apellido", 15, 'M');
        
        boolean resultado = false;
        
        assertEquals(resultado, instancia1.equals(instancia2));
    }
}
