/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargapersona;

/**
 *
 * @author 01
 */
public class Persona {
    private String nombre;
    private int    edad;
    private String dni;
    private String sexo;
    private int    peso;
    private int    altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String dni, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

public int calcularIMC(int peso , int altura)
        {
          int pesoVSaltura;

          
          pesoVSaltura =(peso/(altura^2));
          if (pesoVSaltura < 20) 
          {
           return -1;
           } 
           else if (pesoVSaltura > 20 && pesoVSaltura < 25){
            return 0;   
            }
           else if (pesoVSaltura >  25){
            return 1;   
            }                           
         return 1; 
        }
public boolean esMayorDeEdad (int edad ){
   
    if(edad > 17)
    {
    return true;        
    }
    else  {
            return false;  
    }
        
    
}
public String comprobarSexo(String sexo ){
   
    if( sexo == "H" || sexo == "M" )
    {
    return sexo;        
    }
    else  {
    return "H"; 
    }
        
    
}

}
