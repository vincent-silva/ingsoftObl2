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
    public void setRecorrido(String unAlimento){
        this.alimento = unAlimento;
    }
    public String getRecorrido(){
        return this.alimento;
    }
}

