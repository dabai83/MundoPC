/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles.Arreglos;

/**
 *
 * @author 01
 */
public class Ordenar {
      private int b ; 
    
    public int OrdMenMay( int a[]){
        b = a[0];
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; i < a.length; i++) {
            if (a[j] < a[j+1]) {
                b = a[j];
                a[j]= a[j+1];
                a[j+1] = b;
        
            }
        }
        }
        for (int i = 0; i < a.length; i++) {
          System.out.println("Impresion de arreglo ordenado de menor a mayor " + a[i]);          
        }
return 0;
}
    public int OrdMayMen( int a[]){
        b = a[0];
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; i < a.length; i++) {
            if (a[j] > a[j+1]) {
                b = a[j];
                a[j]= a[j+1];
                a[j+1] = b;
      
            }
        }
        }
        for (int i = 0; i < a.length; i++) {
          System.out.println("Impresion de arreglo ordenado de Mayor a menor " + a[i]);          
        }
return 0;
}    
}