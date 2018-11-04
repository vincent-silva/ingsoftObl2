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
    private String comentarios;
    private String imagen;

    public Mascota(String unNombre, float unAltura, float unPeso, String unComentario, String unaImagen) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.comentarios = unComentario;
        this.imagen = unaImagen;
    }
    public Mascota() {
        this.nombre = "NN";
        this.altura = 0;
        this.peso = 0;
        this.comentarios = "Sin Comentarios";
        this.imagen = "URL";
    }

    public String getNomnbre() {
        return nombre;
    }

    public void setNomnbre(String nomnbre) {
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
}
