/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.decorator;

import com.josue.decorator.inter.ICuenta;
import com.josue.decorator.modelo.Cuenta;

/**
 *
 * @author tony_
 */
public  class SeguroDecorador extends CuentaDecorador{
    
    public  SeguroDecorador(ICuenta cuentaDecorada){
        super(cuentaDecorada);
    }
    
    @Override
    public void aperturarCuenta(Cuenta c){
        cuentaDecorada.aperturarCuenta(c);
        agregarSeguro(c);
    }
    
    public  void agregarSeguro(Cuenta c){
        System.out.println("se agrego seguro a la cuenta del cliente: "+ c.getCliente());
    }
    
}
