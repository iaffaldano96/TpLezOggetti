/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
  private  String nomeBiblioteca;
  private   String indirizzo;
  private   ArrayList<Libro> elencoLibri=new ArrayList<Libro>();
  private  ArrayList<Dipendente> elencoDipendenti=new ArrayList<Dipendente>();
  private  ArrayList<Cliente> elencoClienti=new ArrayList<Cliente>();
  private  ArrayList<Prestito> elencoPrestiti=new ArrayList<Prestito>();

    public Biblioteca(String nomeBiblioteca, String indirizzo) {
        this.nomeBiblioteca = nomeBiblioteca;
        this.indirizzo = indirizzo;
    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public ArrayList<Libro> getElencoLibri() {
        return elencoLibri;
    }

    public ArrayList<Dipendente> getElencoDipendenti() {
        return elencoDipendenti;
    }

    public ArrayList<Cliente> getElencoClienti() {
        return elencoClienti;
    }

    public ArrayList<Prestito> getElencoPrestiti() {
        return elencoPrestiti;
    }        
    
    public String getSchedario(){
    String msg="";
    for (int i=0;i<elencoLibri.size();i++){
    Libro  l=elencoLibri.get(i);
        msg=msg +l.getCodLibro() + " - " +l.getTitolo()+ " - "+l.getAutore()+"\n";
    }
    return msg;
    }
    
}
