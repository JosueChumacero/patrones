/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.model;

/**
 *
 * @author tony_
 */
public class Conexion {
    
    private static Conexion instancia;
    
    private Conexion(){
        
    }
    
    public static Conexion getInstancia(){
        if (instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    public void conectar(){
        System.out.println("Conectado");
    }
    
    public void desconectar(){
        System.out.println("Desconecado");
    }
}
