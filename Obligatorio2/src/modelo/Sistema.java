/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author vince
 */
public class Sistema {
    ArrayList<Mascota> mascotas = new ArrayList<>();
    ArrayList<Persona> personas = new ArrayList<>();
    Familia familia = new Familia(mascotas, personas);
    
}
