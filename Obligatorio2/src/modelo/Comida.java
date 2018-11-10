/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author mjpla
 */
public class Comida extends Evento{
    private String alimento;
    
    public Comida(){
        this.alimento = "";
    }
    public Comida(String unAlimento){
        this.alimento  = unAlimento;
    }
    public void setComida(String unAlimento){
        this.alimento = unAlimento;
    }
    public String getComida(){
        return this.alimento;
    }
    @Override
    public String toString(){
        return super.getResponsable().toString() + " es responsable de darle " + this.getComida() +
                " a " + super.getMascotas().toString();
    }
}

