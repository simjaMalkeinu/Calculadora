/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.backend.calculadoramvc;

import modelo.Modelo;

/**
 *
 * @author Manue
 */
public class CalculadoraMVC {

    public static void main(String[] args) {
        
        Modelo m = new Modelo("1+2+3(5-3)");
        
        m.calcular();
    }
}
