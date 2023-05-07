/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.prototype.model;

import com.josue.prototype.inter.ICuenta;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tony_
 */
public class CuentaAHImpl implements ICuenta{
    
    private String tipo;
    private Double monto;
    
    
    public  CuentaAHImpl(){
        tipo = "AHORRO";
    }

    @Override
    public ICuenta clonar() {
        CuentaAHImpl cuenta= null;
        try {
            cuenta = (CuentaAHImpl)clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(CuentaAHImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cuenta;
    }
    
    @Override
    public String toString(){
        return "cuenta CuentaAHImp=> monto:"+ monto + " tipo:" + tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    
}
