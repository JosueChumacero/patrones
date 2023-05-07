/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.facade;

import com.josue.facade.api.AvionAPI;
import com.josue.facade.api.HotelAPI;

/**
 *
 * @author tony_
 */
public class CheckFacade {

    private final AvionAPI avionAPI;
    private final HotelAPI hotelAPI;

    public CheckFacade() {
        avionAPI = new AvionAPI();
        hotelAPI = new HotelAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
        avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
    }
}
