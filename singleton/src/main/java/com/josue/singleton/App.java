/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.josue.singleton;

import com.josue.model.Conexion;

/**
 *
 * @author tony_
 */
public class App {

    public static void main(String[] args) {
        
        Conexion con = Conexion.getInstancia();
        con.conectar();
        con.desconectar();
    }
}
