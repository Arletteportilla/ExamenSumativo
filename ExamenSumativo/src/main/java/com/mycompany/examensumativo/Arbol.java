/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examensumativo;

/**
 *
 * @author arlet
 */
public class Arbol {
    private NodoArbol raiz;

    public Arbol() {
        raiz = null;
    }

    public void insertar(String valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    public NodoArbol insertarRecursivo(NodoArbol actual, String valor) {
        if (actual == null) {
            return new NodoArbol(valor);
        }
        int valorActual = Integer.parseInt(actual.datos);
        int valorNuevo = Integer.parseInt(valor);
        if (valorNuevo < valorActual) {
            actual.izquierda = insertarRecursivo(actual.izquierda, pathDirectorio);
        } else {
            actual.derecha = insertarRecursivo(actual.derecha, pathDirectorio);
        }
        return actual;
    }

    public boolean busqueda(String pathDirectorio) {
        return busquedaRecursiva(raiz, pathDirectorio);
    }

    public boolean busquedaRecursiva(NodoArbol actual, String pathDirectorio) {
        if (actual == null) {
            return false;
        }
        if (pathDirectorio.equals(actual.datos)) {
            return true;
        }
        if (pathDirectorio.compareTo(actual.datos) < 0) {
            return busquedaRecursiva(actual.izquierda, pathDirectorio);
        } else {
            return busquedaRecursiva(actual.derecha, pathDirectorio);
        }
    }
    public void ayudantePreOrden(NodoArbol nodo)
    {
        if (nodo == null)
                return;
        System.out.println(nodo.datos + ""); //mostrar datos del nodo
        ayudantePreOrden(nodo.izquierda); //mostrar subarbol izquierdo
        ayudantePreOrden(nodo.derecha); // recorte subarbol derecho
    }
    
    public void ayudanteInOrden(NodoArbol nodo)
    {
        if (nodo == null){
                return;
        }
        ayudanteInOrden(nodo.izquierda); 
        System.out.println(nodo.datos + ""); 
        ayudanteInOrden(nodo.derecha); 
    }
    
    public void ayudantePostOrden(NodoArbol nodo)
    {
        if (nodo == null)
            return;
                
        ayudantePostOrden(nodo.izquierda); 
        ayudantePostOrden(nodo.derecha); 
        System.out.println(nodo.datos + "");
    }
    public void recorridoPreOrden()
    {
        ayudantePreOrden(raiz);
    }
    public void recorridoInOrden()
    {
        ayudanteInOrden(raiz);
    }
    public void recorridoPostOrden()
    {
        ayudantePostOrden(raiz);
    }        
    
}
