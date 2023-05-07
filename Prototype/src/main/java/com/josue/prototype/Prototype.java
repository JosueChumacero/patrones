/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.josue.prototype;

import com.josue.prototype.model.CuentaAHImpl;

/**
 *
 * @author tony_
 */
public class Prototype {

    public static void main(String[] args) {
        CuentaAHImpl cuentaAhorro= new CuentaAHImpl();
        cuentaAhorro.setMonto(200d);
        
        CuentaAHImpl cuentaClonada = (CuentaAHImpl)cuentaAhorro.clonar();
        cuentaClonada.setTipo("PLAZO FIJO");
        
        System.out.println(cuentaAhorro.toString());
        System.out.println(cuentaClonada.toString());
    }
}
