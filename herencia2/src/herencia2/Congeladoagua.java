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
public class Congeladoagua extends Productocongelado{
    private double porcsalinidad;

    public Congeladoagua( Date feccauducacion , String nrolote) {
        super(feccauducacion,nrolote);
    }
    public double getPorcsalinidad() {
        return porcsalinidad;
    }

    public void setPorcsalinidad(double porcsalinidad) {
        this.porcsalinidad = porcsalinidad;
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
             "Porcentaje Salinidad :"+this.getPorcsalinidad();
  }
    
}
