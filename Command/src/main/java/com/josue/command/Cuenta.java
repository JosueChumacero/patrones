/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.command;

/**
 *
 * @author tony_
 */
public class Cuenta {

    private int id;
    private Double saldo;

    public Cuenta(int id, Double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public void retirar(Double monto) {
        saldo = saldo - monto;
        System.out.println("retirar: " + monto);
    }

    public void depositar(Double monto) {
        saldo = saldo + monto;
        System.out.println("depositar: " + monto);
    }

}
