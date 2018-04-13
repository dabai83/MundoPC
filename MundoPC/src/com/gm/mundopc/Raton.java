/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;

/**
 *
 * @author 01
 */
public class Raton extends DispositivoEntrada {
    private int idRaton;
    private int contadorRaton;
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }
    @Override
    public String toString(){
        return "";
    }   

    public int getIdRaton() {
        return idRaton;
    }

    public void setIdRaton(int idRaton) {
        this.idRaton = idRaton;
    }

    public int getContadorRaton() {
        return contadorRaton;
    }

    public void setContadorRaton(int contadorRaton) {
        this.contadorRaton = contadorRaton;
    }
    
}
