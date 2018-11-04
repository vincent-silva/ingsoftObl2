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
public class Persona {
    private String nombre;
    private float edad;
    private char sexo;


    public Persona(){
        this.nombre = "NN";
        this.edad = 0;
        this.sexo = 'Q';
    }
    
    public Persona(String unNombre, float unaEdad, char unSexo){
        this.nombre = unNombre;
        this.edad = unaEdad;
        this.sexo = unSexo;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String unNombre) {
        this.nombre = unNombre;
    }    
    public float getEdad(){
        return edad;
    }
    public void setEdad(float unaEdad){
        this.edad = unaEdad;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char unSexo){
        this.sexo = unSexo;
    }
    
    @Override
    public boolean equals(Object obj){
        return this.getNombre().toUpperCase().equals(((Persona)obj).getNombre().toUpperCase());
    }
}