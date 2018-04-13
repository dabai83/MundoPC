/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 01
 */
public class cubo {

    /**
     * @param args the command line arguments
     */
    int ancho;
    int alto;
    int profundo;
    
    public  cubo() {
        
    }
    public  cubo(int a,int b,int c){
    ancho    = a;
    alto     = b;
    profundo = c;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        cubo a = new cubo(3,2,6);
        
        System.out.println(a.alto *a.ancho * a.profundo);
    }
    
}