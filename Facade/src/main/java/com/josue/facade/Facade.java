/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.josue.facade;

/**
 *
 * @author tony_
 */
public class Facade {

    public static void main(String[] args) {
        CheckFacade cliente1 = new CheckFacade();
        cliente1.buscar("02/07/2018", "08/07/2018", "Piura", "Lima");

        CheckFacade cliente2 = new CheckFacade();
        cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Piura");
    }
}
