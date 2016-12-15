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
public class Dipendente extends Persona {

    private String ruolo;

    public Dipendente(String cognome, String nome, String ruolo) {
        super(cognome, nome);
        this.ruolo = ruolo;
    }
    
     public String addNewPrestito(int codCliente, int codLibro, Biblioteca bib) {
        String msg="Impossibile fare il prestito";
        if(codCliente<0 || codLibro<0)
            return msg;
        
        //creo un nuovo oggetto
        Prestito p=new Prestito(codCliente, codLibro, "Prestito del "+new Date().toString());
        bib.getElencoPrestiti().add(p);
        
        msg ="Aggiunto prestito: codCliente= "+ codCliente + "codLibro= " + codLibro;
        return msg;
    }
     
         public String addNewPrestito(int codCliente, int codLibro,String note, Biblioteca bib) {
        String msg="Impossibile fare il prestito";
        if(codCliente<0 || codLibro<0)
            return msg;
        
        //creo un nuovo oggetto
        Prestito p=new Prestito(codCliente, codLibro, note +" "+new Date().toString());
        bib.getElencoPrestiti().add(p);
        
        msg ="Aggiunto prestito: codCliente= "+ codCliente + "codLibro= " + codLibro;
        return msg;
    } 

    public String addNewLibro(String titolo, String autore, Biblioteca bib) {
        String msg="Impossibile aggiungere un libro";
        if(titolo.equals("") || autore.equals(""))
            return msg;
        int newcode = 1;
        if (bib.getElencoLibri().size() > 0) {
            newcode = bib.getElencoLibri().get(bib.getElencoLibri().size() - 1).getCodLibro() + 1;
        }

        Libro l = new Libro(titolo, autore, newcode);
        bib.getElencoLibri().add(l);
        msg ="Aggiunto libro; "+ newcode + "#: " + titolo + " - " + autore;
        return msg;
    }

    public String removeLibroByIndex(int index, Biblioteca bib) {
        String msg = "Impossibile cancellare il libro";
        if (index <= bib.getElencoLibri().size() && index >= 0)//caso vero 
        {
            bib.getElencoLibri().remove(index);
            msg = "Libro eliminato";
        }
        return msg;
    }

}
