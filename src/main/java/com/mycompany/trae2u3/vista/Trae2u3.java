/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trae2u3.vista;


import com.mycompany.trae2u3.modelo.Jugador;
import com.mycompany.trae2u3.servicio.JugadorServicioImpl;
import java.time.LocalDate;
/**
 *
 * @author LAB-2
 */
public class Trae2u3 {
    
     public static void main(String[] args) {
    
       var enner = new Jugador(10,"Enner Valencia",80,175,LocalDate.of(1998, 02, 01));
       var byron = new Jugador(20,"Byron Castillo",80,175,LocalDate.of(1998, 02, 01));
       var dominguez = new Jugador(30,"Dida Dominguez",80,175,LocalDate.of(1998, 02, 01));
       var galindez = new Jugador(40,"Ernan Galindez",80,175,LocalDate.of(1998, 02, 01));
       var galindezNuevo = new Jugador(40,"Hernán Galindez",80,175,LocalDate.of(1990, 02, 01));
       
       
       var jugadorDB = new JugadorServicioImpl();
       jugadorDB.crear(enner);
       jugadorDB.crear(byron);
       jugadorDB.crear(dominguez);
       jugadorDB.crear(galindez);
       System.out.println(jugadorDB.listar());
       jugadorDB.eliminar(20);
       jugadorDB.eliminar(30);
       System.out.println(jugadorDB.listar());
       jugadorDB.modificar(40, galindezNuevo);
       System.out.println(jugadorDB.listar());
    
        
    }
 
}