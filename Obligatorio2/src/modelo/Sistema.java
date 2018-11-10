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

    public Sistema() {
        this.familia = new Familia();
        this.eventos = new ArrayList<>();
    }

    public void setFamilia(Familia unaFamilia) {
        this.familia = unaFamilia;
    }

    public Familia getFamilia() {
        return this.familia;
    }
    
    public void agregarIntegrante(Persona integrante) {
        this.getFamilia().agregarIntegrante(integrante);
    }
    
    public void borrarIntegrante(Persona integrante) {
        this.getFamilia().borrarIntegrante(integrante);
    }
    
    public ArrayList<Persona> getIntegrantes() {
        return this.getFamilia().getIntegrantes();
    }
    
    public void agregarMascota(Mascota mascota) {
        this.getFamilia().agregarMascota(mascota);
    }
    
    public void borrarMascota(Mascota mascota) {
        this.getFamilia().borrarMascota(mascota);
    }
    
    public ArrayList<Mascota> getMascotas() {
        return this.getFamilia().getMascotas();
    }

    public void agregarEvento(Evento unEvento) {
        this.eventos.add(unEvento);
    }

    public void borrarEvento(Evento unEvento) {
        this.eventos.remove(unEvento);
    }

    public ArrayList<Evento> getEventos() {
        return this.eventos;
    }

    public ArrayList<Paseo> getPaseos() {
        ArrayList<Paseo> retorno = null;
        for (Evento ev : this.eventos) {
            if (ev instanceof Paseo) {
                retorno.add((Paseo) ev);
            }
        }
        return retorno;
    }

    public ArrayList<Comida> getComidas() {
        ArrayList<Comida> retorno = null;
        for (Evento ev : this.eventos) {
            if (ev instanceof Comida) {
                retorno.add((Comida) ev);
            }
        }
        return retorno;
    }

    public ArrayList<Evento> getEventosDelDia(int ano, int mes, int dia) {
        ArrayList<Evento> retorno = null;
        for (Evento ev : this.eventos) {
            if (ev.esDelDia(ano, mes, dia)) {
                retorno.add(ev);
            }
        }
        return retorno;
    }
}
