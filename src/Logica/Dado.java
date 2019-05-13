/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Dado {
    public int Lanzamiento(){
    Random r = new Random();
    int numero = r.nextInt(6)+1;
    return numero;
    }
    
    
}
