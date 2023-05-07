/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.josue.command;

/**
 *
 * @author tony_
 */
public class Command {

    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, 200d);
        
        DepositarImpl deposito = new DepositarImpl(cuenta, 1000d);
        RetirarImpl retiro = new RetirarImpl(cuenta, 100d);
        
        Invoker invoker= new Invoker();
        invoker.recibirOPeraciones(retiro);
        invoker.recibirOPeraciones(deposito);
        
        invoker.ejecutarOperaciones();
    }
}
