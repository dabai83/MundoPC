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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
   
  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Introduzca Número entero: ");
        N = sc.nextInt(); 
        if(N%2==0)
           System.out.println("Par");    
        else
            System.out.println("Impar");  
    }
    
}
