/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 01
 */
import java.util.Scanner;
public class imprime {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);

        String  N;
        
        prueba  pr1 = new prueba("Introduzca Datos a imprimir ");
        N = sc.nextLine(); 

          // System.out.println( "hola "+N);    
      prueba  pr = new prueba( N);
    }
    
}
