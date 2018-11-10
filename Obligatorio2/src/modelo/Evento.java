/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author vince
 */
public class Evento {

    private Persona responsable;
    private LocalDateTime fecha;
    private ArrayList<Mascota> mascotas;

    public Evento() {
        responsable = new Persona();
        fecha = null;
    }

    public Evento(Persona unRespnsable, LocalDateTime unaFecha) {
        responsable = unRespnsable;
        fecha = unaFecha;
    }

    public Persona getResponsable() {
        return this.responsable;
    }

    public void setResponsable(Persona unResposable) {
        this.responsable = unResposable;
    }

    public LocalDateTime getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDateTime unaFecha) {
        this.fecha = unaFecha;
    }

    public void agregarMascota(Mascota unaMascota) {
        this.mascotas.add(unaMascota);
    }

    public ArrayList<Mascota> getMascotas() {
        return this.mascotas;
    }

    public void borrarMascota(Mascota unaMascota) {
        this.mascotas.remove(unaMascota);
    }
}
