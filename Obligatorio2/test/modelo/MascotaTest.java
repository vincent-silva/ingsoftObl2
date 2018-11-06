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
    private Mascota instancia;
    
    @Test
    public void setNombre_normal() {
        System.out.println("MascotaTest - setNomnbre: normal");
        instancia = new Mascota();
        
        String unNombre = "Nombre";
        instancia.setNombre(unNombre);
        
        assertEquals(unNombre, instancia.getNombre());
    }
}
