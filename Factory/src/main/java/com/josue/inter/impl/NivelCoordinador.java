/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.inter.impl;

import com.josue.inter.INivel;

/**
 *
 * @author tony_
 */
public class NivelCoordinador implements INivel{

    @Override
    public void aprobar() {
        System.out.println("Aprobador por coordinador");
    }

    @Override
    public void rechazar() {
        System.out.println("Rechazado por coordinador");
    }
    
}
