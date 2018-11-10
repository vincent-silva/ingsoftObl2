/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vince
 */
public class Mascota {
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nomnbre) {
        this.nombre = nomnbre;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    @Override
    public boolean equals(Object obj){
        boolean respuesta = false;
        if (obj instanceof Mascota) {
            respuesta = this.getNombre().toUpperCase().equals(((Mascota)obj).getNombre().toUpperCase());
        }
        return respuesta;
    }
}
