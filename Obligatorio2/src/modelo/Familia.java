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
public class Familia {
    private ArrayList<Mascota> mascotas;
    private ArrayList<Persona> integrantes;

    public Familia() {
        
    }
    
    public Familia(ArrayList<Mascota> mascotas, ArrayList<Persona> integrantes) {
        this.mascotas = mascotas;
        this.integrantes = integrantes;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public ArrayList<Persona> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<Persona> integrantes) {
        this.integrantes = integrantes;
    }
    
    public void addIntegrante(Persona integrante) {
        this.integrantes.add(integrante);
    }
    
    public void delIntegrante(Persona integrante) {
        this.integrantes.remove(integrante);
    }
}
