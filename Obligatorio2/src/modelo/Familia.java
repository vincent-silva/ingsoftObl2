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
    private String nombre;
    private ArrayList<Mascota> mascotas;
    private ArrayList<Persona> integrantes;

    public Familia() {
        this.nombre = "NN";
        this.mascotas = null;
        this.integrantes = null;
    }
    
    public Familia(String unNombre) {
        this.nombre = unNombre;
        this.mascotas = null;
        this.integrantes = null;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String unNombre){
        this.nombre = unNombre;
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
    
    public void addIntegrante(Persona unIntegrante) {
        this.integrantes.add(unIntegrante);
    }
    
    public void delIntegrante(Persona unIntegrante) {
        this.integrantes.remove(unIntegrante);
    }
    public void addMascota(Mascota unaMascota) {
        this.mascotas.add(unaMascota);
    }
    
    public void delMascota(Mascota unaMascota) {
        this.mascotas.remove(unaMascota);
    }
    @Override
    public boolean equals(Object obj){
        return this.getNombre().toUpperCase().equals(((Familia)obj).getNombre().toUpperCase());
    }
}
