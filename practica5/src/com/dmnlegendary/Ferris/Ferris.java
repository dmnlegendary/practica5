/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmnlegendary.Ferris;

/**
 *
 * @author Díaz Jiménez Jorge Arif 3BV2
 */

/*
Creación de la clase Ferris que guarda cualquier modelo afín a este
*/
public class Ferris {
    int llantas;
    
    //Constructor
    public Ferris(){
        this.llantas = 4;
    }
    
    //Método que muestra la información general del carro
    public void informacion(){
        System.out.println("llantas: "+llantas);
    }
}
