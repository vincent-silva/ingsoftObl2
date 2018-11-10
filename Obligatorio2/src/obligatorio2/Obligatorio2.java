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
        
//        this.familia.agregarIntegrante(new Persona("Dniel Martinez", 55, 'M'));
//        this.familia.agregarIntegrante(new Persona("Maria Marta Serra Lima", 77, 'F'));
//        this.familia.agregarIntegrante(new Persona("Julieta Prandi", 40, 'F'));
//        this.familia.agregarMascota(new Mascota("Ataque", 10, 10, 10, "Comentario", "una imagen"));
//        this.familia.agregarMascota(new Mascota("Tony", 10, 10, 10, "otro comentario", "imagen"));
        
        Persona integrante1 = new Persona("Barak Obama", 54, 'M');
        Persona integrante2 = new Persona("Mandrake Wolf", 29, 'M');
        Persona integrante3 = new Persona("Carla Peterson", 29, 'M');
        System.out.println(integrante1);
        modelo.agregarIntegrante(integrante1);

//        
//        Mascota mascota1 = new Mascota("Chicho", 10, 10, 10, "Comentario", "Foto");
//        modelo.getFamilia().getMascotas().add(mascota1);
        
//        VentanaPrincipal ventana = new VentanaPrincipal(modelo);
//        ventana.setVisible(true);
    }
    
}
