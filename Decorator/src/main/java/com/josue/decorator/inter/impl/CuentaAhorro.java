/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.decorator.inter.impl;

import com.josue.decorator.inter.ICuenta;
import com.josue.decorator.modelo.Cuenta;

/**
 *
 * @author tony_
 */
public class CuentaAhorro implements ICuenta{

    @Override
    public void aperturarCuenta(Cuenta c) {
        System.out.println("*************************");
        System.out.println("Se abrió cuenta de ahorros");
        System.out.println("Cliente: "+ c.getCliente());
    }
    
}
