/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Date;

/**
 *
 * @author tss
 */
public class Dipendente extends Persona{
     
    private String ruolo;

    public Dipendente(String ruolo, String nominativo, int numtel) {
        super(nominativo, numtel);
        this.ruolo = ruolo;
    }

    public String getRuolo() {
        return ruolo;
    }    
    
    public void aggLibro(String titolo, String autore, Biblioteca b) {
        int newcode= b.getElencolibri().get(b.getElencolibri().size()-1).getCodLibro()+1;
        Libro l1= new Libro(newcode,titolo,autore);
        b.aggLibro(l1);
    }
    
}
