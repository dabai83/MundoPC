/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargapersona;

import java.util.Scanner;

/**
 *
 * @author 01
 */
public class Cargapersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Persona A = new Persona("", 0, "", "", 0, 0);
    Persona B = new Persona("", 0, "", "", 0, 0);   
    Persona C = new Persona("", 0, "", "", 0, 0); 
    
    Scanner p = new Scanner(System.in);
    //p.nextLine();

    System.out.println("Cargar nombre: " );
    A.setNombre(p.nextLine());
    
    System.out.println("Cargar Sexo: " );
    A.setSexo(p.nextLine());   

    System.out.println("Cargar Edad: " );
    A.setEdad(p.nextInt()); 

    System.out.println("Cargar Peso: " );
    A.setPeso(p.nextInt()); 
    System.out.println("Cargar Altura: " );
    A.setAltura(p.nextInt()); 
    
    System.out.println("Calculo de peso: " +A.calcularIMC(A.getPeso(),A.getAltura()));
    System.out.println("Es mayor de Edad: " +A.esMayorDeEdad(A.getEdad()));
 //
     System.out.println("Cargar nombre: " );
    B.setNombre(p.nextLine());    
    System.out.println("Cargar Edad: " );
    B.setEdad(p.nextInt()); 
    System.out.println("Cargar Sexo: " );
    B.setSexo(p.nextLine()); 
    System.out.println("Cargar Peso: " );
    B.setPeso(p.nextInt()); 
    System.out.println("Cargar Altura: " );
    B.setAltura(p.nextInt()); 
    
    System.out.println("Calculo de peso: " +B.calcularIMC(B.getPeso(),B.getAltura()));
    System.out.println("Es mayor de Edad: " +B.esMayorDeEdad(B.getEdad()));
  
     //
     System.out.println("Cargar nombre: " );
    C.setNombre(p.nextLine());    
    System.out.println("Cargar Edad: " );
    C.setEdad(p.nextInt()); 
    System.out.println("Cargar Sexo: " );
    C.setSexo(p.nextLine()); 
    System.out.println("Cargar Peso: " );
    C.setPeso(p.nextInt()); 
    System.out.println("Cargar Altura: " );
    C.setAltura(p.nextInt()); 
    
    System.out.println("Calculo de peso: " +C.calcularIMC(C.getPeso(),C.getAltura()));
    System.out.println("Es mayor de Edad: " +C.esMayorDeEdad(C.getEdad()));
    }
    
}
