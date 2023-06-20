/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmnlegendary.Ferris;
import java.util.Scanner;

/**
 *
 * @author Díaz Jiménez Jorge Arif 3BV2
 */
public class Carros{
    public static void main(String args[]){
        String info;//Variable que guardara el dat0o de placa actual
        
        /*
        Construcciuón de objetos
        */
        Celebrian sedan = new Celebrian();        
        Portos coupe = new Portos();
        
        Scanner leer = new Scanner(System.in);//Variable que permite leer por teclado la placa
        
        /*
        Ciclo que actúa como menu principal
        */
        do{
            System.out.print("Ingrese la placa: ");
            info = leer.nextLine();
            System.out.println();
            
            char firstCharacter = info.charAt(0);//Ingreso de la placa por el usuario
            
            //Casos posibles al ingresar información
            if (firstCharacter == 'C' && info.length()<8 && sedan.size()<10){
                sedan.guardar(info);
                System.out.println("Información guardada, espacio ocupado en Celebrian: "+sedan.size()+".\n");
            }
            else if (sedan.size()>=10){
                sedan.sacar();
                System.out.println("Trailer de Celebrian descargado.\n");
            }
            else if (firstCharacter == 'P' && info.length()<8 && coupe.size()<10){
                coupe.guardar(info);
                System.out.println("Información guardada, espacio ocupado en Portos: "+coupe.size()+".\n");
            }
            else if (coupe.size()>=10){
                coupe.sacar();
                System.out.println("Trailer de Portos descargado.\n");
            }
            else {
                System.out.println("La placa no pertenece a ningun vehiculo.");
            }
        } while(!"NO".equals(info)); //El ciclo termina cunado el usuario ingresa "NO"
        
        System.out.println("Programa finalizado.");
    }
}
