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
public class Paseo extends Evento{
    private String recorrido;
    
    public Paseo(){
        this.recorrido = "";
    }
    public Paseo(String unRecorrido){
        this.recorrido  = unRecorrido;
    }
    public void setRecorrido(String unRecorrido){
        this.recorrido = unRecorrido;
    }
    public String getRecorrido(){
        return this.recorrido;
    }
}
