/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.josue.decorator;

import com.josue.decorator.inter.ICuenta;
import com.josue.decorator.inter.impl.CuentaAhorro;
import com.josue.decorator.modelo.Cuenta;

/**
 *
 * @author tony_
 */
public class Decorator {

    public static void main(String[] args) {
        Cuenta c = new Cuenta(1,"Josue");
        
        ICuenta cuenta= new CuentaAhorro();
        ICuenta seguro =  new SeguroDecorador(cuenta);
        
        seguro.aperturarCuenta(c);
        
    }
}
