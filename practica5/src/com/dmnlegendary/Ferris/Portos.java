/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmnlegendary.Ferris;
import java.util.Stack;


/**
 *
 * @author Diaz Jiménez Jorge Arif 3BV2
 */
/*
Clase heredada de Ferris
*/
public class Portos extends Ferris{
    //Crear una instancia de stack
    Stack<String> trailer = new Stack<>();
    
    /*
    Constructor de objetos Portos
    */
    public Portos(){
        super();
    }
    
    //Método que guarda los vehiculos por medio de sus placas
    public void guardar(String placa){
        trailer.push(placa);
        // Recorrer la pila y mostrar todos los elementos
            System.out.println("Elementos en la pila: "+trailer);
            System.out.println();
    }
    
    //Método que saca los 10 autos del trailer
    public void sacar(){
        for (int clock=0; clock<10; clock++){
            // Recorrer la pila y mostrar todos los elementos
            System.out.println("Elementos en la pila: "+trailer);
            System.out.println();
            
            trailer.pop();//Saca autos uno por uno
        }
    }
    
    //Obtener la cantidad de autos almacenados
    public int size(){
        return trailer.size();
    }
}
