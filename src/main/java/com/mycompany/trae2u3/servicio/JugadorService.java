/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trae2u3.servicio;

import com.mycompany.trae2u3.modelo.Jugador;
import java.util.List;

/**
 *
 * @author LAB-2
 */
public abstract class JugadorService {
  public abstract void crear(Jugador jugador);

    public abstract void modificar(int codigo, Jugador jugadorModificado);

    public abstract void eliminar(int codigo);

    public abstract List<Jugador> listar();

}

