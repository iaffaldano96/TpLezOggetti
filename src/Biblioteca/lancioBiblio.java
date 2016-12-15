/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class lancioBiblio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca bib = new Biblioteca("Biblio Ivrea", "via ottinetti 2, Ivrea");
        
        Cliente c1;
        c1= new Cliente("Blu", "mario",1);
        bib.getElencoClienti().add(c1);
        c1= new Cliente("Arancione", "Luigi",2);
        bib.getElencoClienti().add(c1);
 
        Dipendente d1;
        d1= new Dipendente("rossi", "mario", "bibliotecario");
        bib.getElencoDipendenti().add(d1);
        d1 = new Dipendente("gentiloni", "matteo", "premier");
        bib.getElencoDipendenti().add(d1);        
        d1.addNewLibro("il signore degli anelli", "tolkien", bib);
        Libro l2 = new Libro("lo hobbit", "tolkien", 2);
        bib.getElencoLibri().add(l2);        
        
        Prestito p;
        p= new Prestito(1, 1, "Blu - signore degli anelli "+new Date().toString());
        bib.getElencoPrestiti().add(p);
        p= new Prestito(2, 2, "Arancione - Hobbit "+new Date().toString());
        bib.getElencoPrestiti().add(p);
         
        //JOptionPane.showMessageDialog(null, bib.getSchedario());

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoWinBiblio(bib).setVisible(true);
            }
        });
        
    }

}


