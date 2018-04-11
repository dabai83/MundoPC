/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 01
 */
public class Congeladoaire extends Productocongelado{
    private double porcnitrogeno;
    private double porcoxigeno;
    private double porcdioxido;
    private double porcvapor;

    public Congeladoaire( Date feccauducacion , String nrolote) {
        super(feccauducacion,nrolote);
    }
    public double getPorcnitrogeno() {
        return porcnitrogeno;
    }

    public void setPorcnitrogeno(double porcnitrogeno) {
        this.porcnitrogeno = porcnitrogeno;
    }

    public double getPorcoxigeno() {
        return porcoxigeno;
    }

    public void setPorcoxigeno(double porcoxigeno) {
        this.porcoxigeno = porcoxigeno;
    }

    public double getPorcdioxido() {
        return porcdioxido;
    }

    public void setPorcdioxido(double porcdioxido) {
        this.porcdioxido = porcdioxido;
    }

    public double getPorcvapor() {
        return porcvapor;
    }

    public void setPorcvapor(double porcvapor) {
        this.porcvapor = porcvapor;
    }
      @Override
    public String MostrarInfo(){
     //formatoFecha.parse("31/12/2017");
      //  System.out.println("fecha: "+formatoFecha.format(formatoFecha.parse("31/12/2017")))     
     DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
     return "Fecha de Caducidad: " + formatoFecha.format(this.getFechacaducidad()) + "\n"+
            "Nro de Lote: " + this.getNrolote()  + "\n"+
            "Pais de Origen: " + this.getPaisorigen()  + "\n"+
            "Fecha de Envase: " + formatoFecha.format(this.getFechaenvase())+"\n"+
            "Temperatura: " + this.getTemperatura()+ "\n"+
            "Porcentaje de Dioxido :"+this.porcdioxido +"\n"+ 
            "Porcentaje de Nitrogeno :"+this.porcnitrogeno +"\n"+
            "Porcentaje de Oxigeno :"+this.porcoxigeno +"\n"+
            "Porcentaje de Vapor :" +this.porcvapor ;
  }  
}
