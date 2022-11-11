/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trae2u3.servicio;

import com.mycompany.trae2u3.modelo.Estudiante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAB-2
 */
public class EstudianteService {
private final List<Estudiante> estudianteList;

    public EstudianteService() {
        this.estudianteList= new ArrayList<>();
    }
    
    public void crear(Estudiante estudiante){
        this.estudianteList.add(estudiante);
    }
    public List<Estudiante> listar(){
        return this.estudianteList;
    }
    
    public void eliminarPorPosicion(int posicion){
        this.estudianteList.remove(posicion);
    }

}

