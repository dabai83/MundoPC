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
public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private int contadorTeclado;   
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }
    @Override
    public String toString(){
        return "";
    }   

    public int getIdTeclado() {
        return idTeclado;
    }

    public void setIdTeclado(int idTeclado) {
        this.idTeclado = idTeclado;
    }

    public int getContadorTeclado() {
        return contadorTeclado;
    }

    public void setContadorTeclado(int contadorTeclado) {
        this.contadorTeclado = contadorTeclado;
    }
    
}
