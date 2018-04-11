/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author 01
 */
public class testHerencia3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
      //Formateando la fecha:
       // Date fechaActual = new Date();
     //   fechaActual = formatoFecha.format(formatoFecha.parse("31/12/2017"));
        //fechaActual.setDate(20180326);

        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
       // System.out.println("fecha: "+formatoFecha.format(formatoFecha.parse("31/12/2017")));       

        // TODO code application logic here, nrolote);

        Date time = new Date();
        Date fechacau = new Date();
        Date fechaenv = new Date();
        //
        time = formatoFecha.parse("30/05/2018");
        fechacau = formatoFecha.parse("12/01/2019");
        fechaenv = formatoFecha.parse("25/01/2018");
        // SimpleDateFormat  fechaformato = new SimpleDateFormat("dd/MM/YY");
        //  System.out.println("Prueba de Fecha "+ fechaformato.format(31/10/17));
        //FRESCOS
        Productofresco a = new Productofresco(time, "n23wew222");
        Productofresco b = new Productofresco(time, "adsdm2324");
        //REFRIGERADOS
        Productorefrigerante c = new Productorefrigerante(time, "sasasasas", 12.3);
        Productorefrigerante d = new Productorefrigerante(time, "s1s1s1s1s", 29.5);
        Productorefrigerante e = new Productorefrigerante(time, "s2s2s2s2s", 1.0);
        //CONGELADOS
        Congeladoagua f = new Congeladoagua(fechacau, "123433453");
        Congeladoagua g = new Congeladoagua(fechacau, "142323322");
        
        Congeladoaire h = new Congeladoaire(time, "123442322");
        Congeladoaire i = new Congeladoaire(time, "123442322");
        
        Congeladonitrogeno j = new Congeladonitrogeno(time, "2wqwqsqwqxsxwq");
        
        a.setFechaenvase(fechaenv);
        b.setFechaenvase(fechaenv);
        c.setFechaenvase(fechaenv);         
        d.setFechaenvase(fechaenv); 
        e.setFechaenvase(fechaenv); 
        f.setFechaenvase(fechaenv);
        g.setFechaenvase(fechaenv); 
        h.setFechaenvase(fechaenv); 
        i.setFechaenvase(fechaenv); 
        j.setFechaenvase(fechaenv);      
        //fresco
        System.out.println("Producto fresco1 \n"+ a.MostrarInfo() +"\n-------------------");
        System.out.println("Producto fresco2 \n"+ b.MostrarInfo()+"\n-------------------");
        //refrigerado 
        System.out.println("Producto refrigerado1 \n"+ c.MostrarInfo()+ "\n-------------------");
        System.out.println("Producto refrigerado2 \n"+ d.MostrarInfo() + "\n-------------------");
        System.out.println("Producto refrigerado3 \n"+ e.MostrarInfo() + "\n-------------------");
        //refrigerado 
        System.out.println("Producto Congelado por Agua1 \n"+ f.MostrarInfo()+"\n-------------------");
        System.out.println("Producto Congelado por Agua2 \n"+ g.MostrarInfo()+"\n-------------------");
        
        System.out.println("Producto Congelado por Aire1 \n"+ h.MostrarInfo()+"\n-------------------");
        System.out.println("Producto Congelado por Aire2 \n"+ i.MostrarInfo()+"\n-------------------");
        
        System.out.println("Producto Congelado por Nitrogeno \n"+ j.MostrarInfo()+"\n-------------------");
    }
    }