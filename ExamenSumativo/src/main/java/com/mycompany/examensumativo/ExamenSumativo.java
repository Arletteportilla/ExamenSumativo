/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examensumativo;

/**
 *
 * @author arlet
 */
public class ExamenSumativo {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar("/10");
        arbol.insertar("/15");
        arbol.insertar("/5");
        arbol.insertar("/3");
        arbol.insertar("/8");       
        arbol.insertar("/20");
        //System.out.println(arbol.busqueda("/10/5/15/3/8/20"));
        System.out.println("\n\nRecorrido PreOrden:");
        arbol.recorridoPreOrden();
        System.out.println("\n\nRecorrido InOrden:");
        arbol.recorridoInOrden();
        System.out.println("\n\nRecorrido PostOrden:");
        arbol.recorridoPostOrden();
        
    }
}
