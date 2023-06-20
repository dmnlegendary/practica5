/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmnlegendary.Ferris;
/*
Importación de librerias para manejo de colas
*/
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author Díaz Jiménez Jorge Arif 3BV2
 */

/*
Clase heredada de Ferris
*/
public class Celebrian extends Ferris{
    // Crear una instancia de Queue utilizando LinkedList
    Queue<String> trailer = new LinkedList<>();
    
    //Constructor del objeto Celebrian
    public Celebrian(){
        super();
    }
    
    //Método que permite guardar los autos en un trailer por medio de Cola
    public void guardar(String placa){
        trailer.offer(placa);
        
        // Imprimir los elementos de la cola
        System.out.println("Elementos de la cola: "+trailer);
        System.out.println();
    }
    
    //Esta función vacia los 10 autos guardados
    public void sacar(){
        for (int clock=0; clock<10; clock++){
            // Imprimir los elementos de la cola
            System.out.println("Elementos de la cola: "+trailer);
            System.out.println();
            
            //Sacar carros del trailer
            trailer.poll();
        }
    }
    
    //Obtener el tamaño de la cola
    public int size(){
        return trailer.size();
    }
}
