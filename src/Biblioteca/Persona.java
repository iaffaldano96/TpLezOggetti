/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author tss
 */
public class Persona {
    
     
    private String nominativo;    
    private int numtel;

    public Persona(String nominativo, int numtel) {
        this.nominativo = nominativo;
        this.numtel = numtel;
    }

    public int getNumtel() {
        return numtel;
    }    

    public String getNominativo() {
        return nominativo;
    }    
    
}
