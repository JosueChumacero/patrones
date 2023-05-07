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
public abstract class CuentaDecorador implements ICuenta{
    
    protected  ICuenta cuentaDecorada;
    
    public  CuentaDecorador(ICuenta cuentaDecorada){
        this.cuentaDecorada=cuentaDecorada;
    }
    
    @Override
    public void aperturarCuenta(Cuenta c){
        this.cuentaDecorada.aperturarCuenta(c);
    }
}
