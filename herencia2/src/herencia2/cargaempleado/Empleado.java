/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2.cargaempleado;

/**
 *
 * @author 01
 */
public class Empleado {
 private String nombre;
 private String cedula;
 private int edad;
 private boolean casado;
 private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String cedula, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
 public String Edadmostrar(int edad){
     String valor; 
     if (edad < 21){
        valor ="Principiante";
        return valor;  
     }  
     else if (edad >= 22 && edad <= 35){
        valor = "Intermedio";
        return valor;
     }
     else if (edad > 35){
        valor = "Senior";
        return valor;
     }
     return null;
  }
  public double aumentosal(double porcentaje){
     double nuevosalario;
     nuevosalario = salario + (salario * porcentaje/100);
     return nuevosalario;
  }
    public String MostrarInfo(){
     String var;
     var = "Nombre: " + this.nombre + "\n" + "Cedula: " + this.cedula + "\n" +
             "Edad: " + this.edad   + "\n" + "Casado: " + this.casado + "\n" +
          "Salario: " + this.salario + "\n" + "Clasificacion: " + this.Edadmostrar(edad)
             //+ "\n" +"Salario aumentado a:" + this.aumentosal(this.getSalario())
             ;
     return var;
  }
}   
