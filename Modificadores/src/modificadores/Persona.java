/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modificadores;

/**
 *
 * @author 01
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String edad;
    private String sexo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }
    public String getNombre(){
     return nombre;
    }           
    public String getApellido(){
     return apellido;
    } 
    public String getEdad(){
     return edad;
    }     
    public String getSexo(){
     return sexo;
    }     
    public void setNombre(String newnombre){
     nombre = newnombre;
    }     
   public void setApellido(String newApellido){
     apellido = newApellido;
    }
   public void setEdad(String newedad){
     edad = newedad;
    }
   public void setSexo(String newSexo){
     sexo = newSexo;
    }
}
