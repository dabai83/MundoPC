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
public class Productocongelado extends Producto{
   private double temperatura;

    public Productocongelado( Date feccauducacion , String nrolote) {
        super(feccauducacion,nrolote);
    }
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
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
            "Temperatura :"+this.temperatura;
  }   
}
