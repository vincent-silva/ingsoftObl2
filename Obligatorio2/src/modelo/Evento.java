/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author vince
 */
public class Evento {
    private Persona responsable;
    private LocalDateTime fecha;
    
    public Evento(){
        responsable = new Persona();
        fecha = null;
    }
    public Evento(Persona unRespnsable, LocalDateTime unaFecha){
        responsable = unRespnsable;
        fecha = unaFecha;
    }
}


