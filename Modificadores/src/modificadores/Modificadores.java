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
public class Modificadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Alberto", "Aguero", "34", "M");
        
        System.out.println("Persona:"+" "+p.getNombre()+" "+ p.getApellido()
                        +" "+p.getEdad()+" "+p.getSexo());
      
      p.setNombre("Ana");
      p.setApellido("Ibarra");
      p.setEdad("35");
      p.setSexo("F");
        System.out.println("Persona:"+" "+p.getNombre()+" "+ p.getApellido()
                        +" "+p.getEdad()+" "+p.getSexo());

    }
    
}
