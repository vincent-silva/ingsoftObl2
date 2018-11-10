/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2;

import modelo.Mascota;
import modelo.Persona;
import modelo.Sistema;
import vistas.VentanaPrincipal;

/**
 *
 * @author vince
 */
public class Obligatorio2 {
    
    public static void main(String[] args) {
        Sistema modelo = new Sistema();
        
        Persona integrante1 = new Persona("Barak Obama", 54, 'M');
        Persona integrante2 = new Persona("Mandrake Wolf", 29, 'M');
        Persona integrante3 = new Persona("Carla Peterson", 29, 'M');
        
        modelo.getFamilia().getIntegrantes().add(integrante1);
//        modelo.getFamilia().getIntegrantes().add(integrante2);
//        modelo.getFamilia().getIntegrantes().add(integrante3);
//        
//        Mascota mascota1 = new Mascota("Chicho", 10, 10, 10, "Comentario", "Foto");
//        modelo.getFamilia().getMascotas().add(mascota1);
        
//        VentanaPrincipal ventana = new VentanaPrincipal(modelo);
//        ventana.setVisible(true);
    }
    
}
