/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author vince
 */
public class Familia {
    private String nombre;
    private ArrayList<Mascota> mascotas;
    private ArrayList<Persona> integrantes;
    private ArrayList<Image> imagenes;
    private String comentarios;

    public Familia() {
        this.nombre = "";
        this.mascotas = null;
        this.integrantes = null;
        this.imagenes = null;
        this.comentarios = "";
    }
    
    public Familia(String unNombre) {
        this.nombre = unNombre;
        this.mascotas = null;
        this.integrantes = null;
        this.imagenes = null;
        this.comentarios = "";
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
    
    public void agregarIntegrante(Persona unIntegrante) {
        this.integrantes.add(unIntegrante);
    }
    
    public void borrarIntegrante(Persona unIntegrante) {
        this.integrantes.remove(unIntegrante);
    }
    public void agregarMascota(Mascota unaMascota) {
        this.mascotas.add(unaMascota);
    }
    
    public void borrarMascota(Mascota unaMascota) {
        this.mascotas.remove(unaMascota);
    }
    
    @Override
    public boolean equals(Object obj){
        boolean respuesta = false;
        if (obj instanceof Familia){
            respuesta =  this.getNombre().toUpperCase().equals(((Familia)obj).getNombre().toUpperCase());
        }
        return respuesta;
    }
}
