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
public class Sistema {
    
    private Familia familia;
    private ArrayList<Evento> eventos;
    
    public Sistema(){
        this.familia = null;
        this.eventos = null;
    }
    public void setFamilia(Familia unaFamilia){
        this.familia = unaFamilia;
    }
    public Familia getFamilia(){
        return this.familia;
    }
    public void agregarEvento(Evento unEvento){
        this.eventos.add(unEvento);
    }
    public void borrarEvento(Evento unEvento){
        this.eventos.remove(unEvento);
    }
    public ArrayList<Evento> getEventos(){
        return this.eventos;
    }
    public ArrayList<Paseo> getPaseos(){
        ArrayList<Paseo> retorno = null;
        for(Evento ev : this.eventos){
            if(ev instanceof Paseo)
                retorno.add((Paseo)ev);
        }
        return retorno;
    }
    public ArrayList<Comida> getComidas(){
        ArrayList<Comida> retorno = null;
        for(Evento com : this.eventos){
            if(com instanceof Comida)
                retorno.add((Comida)com);
        }
        return retorno;
    }
}
