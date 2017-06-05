/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_tercero;

/**
 *
 * @author MCROBERTW
 */
public class Nodo {
    Character dato; //elemento, valor, contenido
    Nodo siguiente; //enlace, continuacion, autoreferencia, sig
    
    public Nodo(){
        dato=null;
        siguiente=null;
       }
    public Nodo(Character dato){
        this.dato=dato;
        siguiente=null;
    }
    public Nodo(Character dato, Nodo referencia){
        this.dato=dato;
        siguiente=referencia;
    }
}
