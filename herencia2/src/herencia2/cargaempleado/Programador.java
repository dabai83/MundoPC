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
public class Programador  extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    public Programador() {
    }

    public Programador(String nombre, String cedula, double salario) {
        super(nombre, cedula, salario);
    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante     = lenguajeDominante;
    }
    @Override
    public String MostrarInfo(){
     String var;
     var = "Nombre: " + this.getNombre() + "\n" + "Cedula: " + this.getCedula() + "\n" +
             "Edad: " + this.getEdad()   + "\n" + "Casado: " +  this.isCasado()  + "\n" +
          "Salario: " + this.getSalario() + "\n" + "Clasificacion: " + this.Edadmostrar(this.getEdad())+ "\n" +
          "Lineas de Codigo por Hora:" + this.lineasDeCodigoPorHora + "\n" +
          "Lenguaje Dominante:" + this.lenguajeDominante
           //  + "\n" +"Salario aumentado a:" + this.aumentosal(this.getSalario())
             ;
     return var;
  }  
}
