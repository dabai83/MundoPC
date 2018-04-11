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
public class Producto {
    private Date fechacaducidad;
    private String nrolote;
    private String paisorigen; 
    private Date fechaenvase;


    public Date getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(Date fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public String getNrolote() {
        return nrolote;
    }

    public void setNrolote(String nrolote) {
        this.nrolote = nrolote;
    }

    public String getPaisorigen() {
        return paisorigen;
    }

    public void setPaisorigen(String paisorigen) {
        this.paisorigen = paisorigen;
    }

    public Date getFechaenvase() {
        return fechaenvase;
    }

    public void setFechaenvase(Date fechaenvase) {
        this.fechaenvase = fechaenvase;
    }

    public Producto(Date fechacaducidad, String nrolote) {
        this.fechacaducidad = fechacaducidad;
        this.nrolote = nrolote;
    }
    public String MostrarInfo(){
     String var;
     DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
     //formatoFecha.parse("31/12/2017");
      //  System.out.println("fecha: "+formatoFecha.format(formatoFecha.parse("31/12/2017")))     
     var = "Fecha de Caducidad: " + formatoFecha.format(this.fechacaducidad) + "\n"+
           "Nro de Lote: " + this.nrolote  + "\n"+
           "Pais de Origen: " + this.paisorigen  + "\n"+
           "Fecha de Envase: " + formatoFecha.format(this.fechaenvase);
     return var;
  }
}
