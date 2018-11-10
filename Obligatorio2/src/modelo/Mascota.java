/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Observable;

/**
 *
 * @author vince
 */
public class Mascota extends Observable {
    private String nombre;
    private float altura;
    private float peso;
    private int edad;
    private String comentarios;
    private String imagen;

    public Mascota(String unNombre, float unAltura, float unPeso, int unaEdad, String unComentario, String unaImagen) {
        this.nombre = unNombre;
        this.altura = unAltura;
        this.peso = unPeso;
        this.comentarios = unComentario;
        this.imagen = unaImagen;
        this.edad = unaEdad;
    }
        
    public Mascota() {
        this.nombre = "NN";
        this.altura = 0;
        this.peso = 0;
        this.comentarios = "Sin Comentarios";
        this.imagen = "URL";
    }
    
    public Mascota(Mascota unaMascota) {
        this.nombre = unaMascota.getNombre();
        this.altura = unaMascota.getAltura();
        this.peso = unaMascota.getPeso();
        this.comentarios = unaMascota.getComentarios();
        this.imagen = unaMascota.getImagen();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        this.notifyObservers();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomnbre) {
        this.nombre = nomnbre;
        this.notifyObservers();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
        this.notifyObservers();
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.notifyObservers();
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
        this.notifyObservers();
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
        this.notifyObservers();
    }
    
    @Override
    public boolean equals(Object obj){
        boolean respuesta = false;
        if (obj instanceof Mascota) {
            respuesta = this.getNombre().toUpperCase().equals(((Mascota)obj).getNombre().toUpperCase());
        }
        return respuesta;
    }
    @Override
    public String toString(){
        return this.getNombre();
    }
    
    /**
     * Se sobreescribe para ejecutar setChanged, ya que se espera que se
     * ejecuten juntos siempre dentro del modelo
     */
    @Override
    public void notifyObservers(){
        this.setChanged();
        super.notifyObservers();
    }
}
