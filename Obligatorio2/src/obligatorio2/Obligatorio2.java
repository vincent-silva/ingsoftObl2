/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Mascota;
import modelo.Persona;
import modelo.Sistema;
import vistas.VentanaDePruebas;
import vistas.VentanaPrincipal;

/**
 *
 * @author vince
 */
public class Obligatorio2 {
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, UnsupportedLookAndFeelException, IllegalAccessException {
        Sistema modelo = new Sistema();
        
        Persona integrante1 = new Persona("Barak Obama", 54, 'M');
        Persona integrante2 = new Persona("Mandrake Wolf", 29, 'M');
        Persona integrante3 = new Persona("Carla Peterson", 29, 'M');
        Mascota mascota1 = new Mascota("Ataque", 10, 10, 10, "Comentario", "D:\\ORT\\Materias\\IngenieriaDeSoftware\\Pinder\\dogrunning.jpg");
        Mascota mascota2 = new Mascota("Tony", 10, 10, 10, "otro comentario", "imagen");
        System.out.println(integrante1);
        modelo.agregarIntegrante(integrante1);
        modelo.agregarIntegrante(integrante2 );
        modelo.agregarIntegrante(integrante3);
        modelo.agregarMascota(mascota1);
        modelo.agregarMascota(mascota2); 
        
//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        VentanaPrincipal ventana = new VentanaPrincipal(modelo);
        ventana.setVisible(true);
        
        VentanaDePruebas ventana2 = new VentanaDePruebas(modelo);
        ventana2.setVisible(true);
    }
    
}
