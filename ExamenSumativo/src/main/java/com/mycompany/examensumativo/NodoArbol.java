/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examensumativo;

/**
 *
 * @author arlet
 */
public class NodoArbol {
    public String datos; 
    public NodoArbol izquierda;
    public NodoArbol derecha;
    
    public NodoArbol(String datos) {
       this.datos=datos;
       this.izquierda=null;
       this.derecha=null;
    }
}
