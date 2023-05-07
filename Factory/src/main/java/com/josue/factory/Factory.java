/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.josue.factory;

import com.josue.inter.INivel;

/**
 *
 * @author tony_
 */
public class Factory {

    public static void main(String[] args) {
        
        NivelFabrica nivel = new NivelFabrica();
        
        INivel coordinador =  nivel.getNivel("Coordinador");
        coordinador.aprobar();
        coordinador.rechazar();
        
        INivel gerente =  nivel.getNivel("Gerente");
        gerente.aprobar();
        gerente.rechazar();
        
        INivel administrador =  nivel.getNivel("Administrador");
        administrador.aprobar();
        administrador.rechazar();
        
        INivel directorio =  nivel.getNivel("Directorio");
        directorio.aprobar();
        directorio.rechazar();
    }
}
