/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class DemoBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Biblioteca bib= new Biblioteca("Biblio Ivrea", "via palestra 2, Ivrea");
        Dipendente d1= new Dipendente("Bibliotecario", "Rossi Mario", 346);
        Dipendente d2= new Dipendente("Premier", "Matteo Bianchi", 467);        
        //bib.getElencodipendenti().add(d1);
        bib.aggDipendente(d2);
        bib.aggDipendente(d1);
        Libro l1= new Libro(1, "Il signore degli anelli", "Tolkien");
        Libro l2= new Libro(2, "Lo Hobbit", "Tolkien");
        bib.aggLibro(l1);
        bib.aggLibro(l2);
        
        JOptionPane.showMessageDialog(null,"Elenco libri\n"+bib.stampaLibri());        
        
    }
    
    
    
}
