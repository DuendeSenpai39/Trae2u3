/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trae2u3.servicio;

import com.mycompany.trae2u3.modelo.Jugador;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author LAB-2
 */
public class JugadorService {
    private final List<Jugador> jugadorList;

    public JugadorService() {
        this.jugadorList= new ArrayList<>();
    }
    
    public void crear(Jugador jugador){
        this.jugadorList.add(jugador);
    }
    public List<Jugador> listar(){
        return this.jugadorList;
    }
    
    public void eliminarPorPosicion(int posicion){
        this.jugadorList.remove(posicion);
    }

}
