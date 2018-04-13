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
public class Operaciones {
    private int b = 0; 
    
    public int ArrMayor( int a[]){
       //trae numero mayor del vector
       b = a[0];
        for (int i = 0; i < a.length; i++) {
            
            if (a[i]< b) {
               b = a[i];  
            }
        }
        return b;
   }
    public int ArrMenor( int a[]){
       //trae numero mayor del vector
       b = a[0];
        for (int i = 0; i < a.length; i++) {
            
            if (a[i]> b) {
               b = a[i];  
            }
        }
        return b;
   } 
    public int ArrSuma( int a[]){
       //trae numero mayor del vector

        for (int i = 0; i < a.length; i++) {         
               b = b + a[i];  
        }
        return b;
   }     

    public int ArrRestar( int a[]){
       //trae numero mayor del vector

        for (int i = 0; i < a.length; i++) {         
               b = a[i] - b ;  
        }
        return b;
   }      
}
