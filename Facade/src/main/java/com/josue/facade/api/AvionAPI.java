/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.facade.api;

/**
 *
 * @author tony_
 */
public class AvionAPI {

    public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
        System.out.println("==============================");
        System.out.println("Vuelos encontrados para " + destino + " desde " + origen);
        System.out.println("Fecha IDA: " + fechaIda + " Fecha Vuelta " + fechaVuelta);
        System.out.println("==============================");
    }
}
