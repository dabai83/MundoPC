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
public class Cargaempleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e = new Empleado("Albert", "2511499", 1000000);
        Programador p = new Programador(2, "java");
        p.setNombre("Diego");
        p.setEdad(40);
        p.setSalario(2000000);
        
        e.setSalario(1200000);
        e.setEdad(34);
        //e.aumentosal(10);
        System.out.println( e.MostrarInfo() + "\nSalario Aumentado: "+ e.aumentosal(10)+"\n-------------------");
 //       System.out.println("Salario Aumentado: "+ e.aumentosal(10)+"\n-------------------");
        System.out.println(p.MostrarInfo()+"\nSSalario Aumentado: "+ p.aumentosal(15));
     
    }
    
}
