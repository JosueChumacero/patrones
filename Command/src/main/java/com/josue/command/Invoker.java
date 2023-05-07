/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tony_
 */
public class Invoker {
    
    private List<IOperacion> operaciones = new ArrayList<>();
    
    public  void recibirOPeraciones(IOperacion operacion){
        operaciones.add(operacion);
    }
    
    public void ejecutarOperaciones(){
        operaciones.forEach(x-> x.execute());
    }
}
