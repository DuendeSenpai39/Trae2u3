/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trae2u3.vista;


import com.mycompany.trae2u3.modelo.Jugador;
import com.mycompany.trae2u3.servicio.JugadorService;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author LAB-2
 */
public class Trae2u3 {
    
     public static void main(String[] args) {
    
       var enner = new Jugador("Enner Valencia",80,175,LocalDate.of(1998, 02, 01));
       var byron = new Jugador("Byron Castillo",80,175,LocalDate.of(1998, 02, 01));
       var dominguez = new Jugador("Dida Dominguez",80,175,LocalDate.of(1998, 02, 01));
       var galindez = new Jugador("Hernán Galindez",80,175,LocalDate.of(1998, 02, 01));
       
       
       var baseDatosJugadores = new JugadorService;
       baseDatosJugadores.crear(enner);
       baseDatosJugadores.crear(byron);
       baseDatosJugadores.crear(dominguez);
       baseDatosJugadores.crear(galindez);
       System.out.println(baseDatosJugadores.listar());
       baseDatosJugadores.eliminarPorPosicion(1);
       System.out.println(baseDatosJugadores.listar());
    }
 }
