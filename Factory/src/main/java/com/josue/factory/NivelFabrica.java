/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josue.factory;

import com.josue.inter.INivel;
import com.josue.inter.impl.NivelAdministrador;
import com.josue.inter.impl.NivelCoordinador;
import com.josue.inter.impl.NivelDIrectorio;
import com.josue.inter.impl.NivelGerente;

/**
 *
 * @author tony_
 */
public class NivelFabrica {

    public INivel getNivel(String tipo) {
        switch (tipo) {
            case "Administrador":
                return new NivelAdministrador();
            case "Coordinador":
                return new NivelCoordinador();
            case "Gerente":
                return new NivelGerente();
            case "Directorio":
                return new NivelDIrectorio();
            default:
                return null;
        }
    }
}
