/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mjpla
 */
public class MascotaTest {
    @Test
    public void setEdad_normal() {
        Mascota instancia = new Mascota();
        
        int edad = 10;
        instancia.setEdad(edad);
        
        assertEquals(edad, instancia.getEdad());
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void setEdad_negativo() {
        Mascota instancia = new Mascota();
        
        int edad = -10;
        instancia.setEdad(edad);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void setEdad_nulo() {
        Mascota instancia = new Mascota();
        
        int edad = 0;
        instancia.setEdad(edad);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void sedEdad_muyGrande() {
        Mascota instancia = new Mascota();
        
        int edad = 21;
        instancia.setEdad(edad);
    }
    
    @Test
    public void setPeso_normal() {
        Mascota instancia = new Mascota();
        
        float peso = 10;
        instancia.setPeso(peso);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void setPeso_negativo() {
        Mascota instancia = new Mascota();
        
        float peso = -10;
        instancia.setPeso(peso);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void setPeso_muyGrande() {
        Mascota instancia = new Mascota();
        
        float peso = 100;
        instancia.setPeso(peso);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void setPeso_nulo() {
        Mascota instancia = new Mascota();
        
        float peso = 0;
        instancia.setPeso(peso);
    }
    
    @Test
    public void equals_mismoObjeto() {
        Mascota instancia = new Mascota();
        boolean resultado = true;
        
        assertEquals(resultado, instancia.equals(instancia));
    }
    
    @Test
    public void equals_nulo() {
        Object obj = null;
        Mascota instancia = new Mascota();
        boolean resultado = false;
        
        assertEquals(resultado, instancia.equals(obj));        
    }
    
    @Test
    public void equals_diferentesPersonas() {
        Mascota instancia1 = new Mascota("un nombre", 10, 10, 10, "Comentario", "Imagen");
        Mascota instancia2 = new Mascota("un nombre", 11, 10, 9, "Comentario", "Imagen");
        
        boolean resultado = false;
        
        assertEquals(resultado, instancia1.equals(instancia2));
    }
}
