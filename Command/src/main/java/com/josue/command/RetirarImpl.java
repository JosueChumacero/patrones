/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.command;

/**
 *
 * @author tony_
 */
public class RetirarImpl implements IOperacion{
    
    private Cuenta cuenta;
    private Double monto;

    public RetirarImpl(Cuenta cuenta, Double monto) {
        this.cuenta = cuenta;
        this.monto = monto;
    }
    
    @Override
    public void execute() {
        cuenta.retirar(monto);
    }
}
