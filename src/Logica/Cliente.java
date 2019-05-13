/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Cliente {
    public void Cliente(){
    Dado d1 = new Dado();
    Dado d2 = new Dado();
    int [] frecuencia = new int [11];
    for( int i = 0;i<1000;i++){
         int suma = d1.Lanzamiento() + d2.Lanzamiento();
          frecuencia [suma-2] = frecuencia [suma-2]+1;
    }
    for ( int i=0 ; i<11;i++){
       
        System.out.println("La frecuencia de " + (i+2) + " es:" + frecuencia[i]);
           
    }
    }
    
}
