/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_tercero;
import java.util.*;
/**
 *
 * @author MCROBERTW
 */
public class TDA_TERCEROB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        Character letra;
        
        Nodo cola=new Nodo();
        Nodo anterior, temporal; 
        do{
            System.out.println("Ingrese letra: (E para salir) ");
            letra=teclado.next().charAt(0);
            
            //Inserción cuando la cola esta en su estado inicial
            if(cola.dato==null)
            {
                cola=new Nodo(letra) ;
                continue;
            }
            
            //Inserción cuando la cola ya cuenta con un elemento
            temporal=cola;
            anterior=new Nodo();
            while (temporal!=null)
            {   
              anterior=temporal;
              temporal=temporal.siguiente;  
            }
            anterior.siguiente=new Nodo(letra);
         }while(letra!='E');
        
        temporal=cola;
        System.out.println("Mostrando elementos de la cola...");
        while(temporal!=null)
        {
            System.out.println("Dato: "+temporal.dato);
            temporal=temporal.siguiente;
        }
        
    }
    
}
