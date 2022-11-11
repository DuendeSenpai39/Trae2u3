/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trae2u3.modelo;

import java.time.LocalDate;

/**
 *
 * @author LAB-2
 */
public class Jugador {
    double peso ;
    int estatura;
    String nombre;
    LocalDate fechaNacimiento;

    public Jugador(String nombre, double peso, int estatura, LocalDate fechaNacimiento) {
        this.peso = peso;
        this.estatura = estatura;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    

    @Override
    public String toString() {
        return "Jugador{" + "peso=" + peso + ", estatura=" + estatura + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
