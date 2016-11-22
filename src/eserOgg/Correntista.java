/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserOgg;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Correntista {
    
    private String nominativo;
    private int anno;
    private double conto=0;

    public Correntista(String cognome, int anno) {
        this.nominativo = cognome;
        this.anno = anno;
    }
    
    String stampaNomi(){
        String frase;
        frase="Nominativo: "+nominativo+" Anno di nascita: "+anno;
        return frase;
    }
    
    void prelievo(double soldi){
        if(conto<=0)
            JOptionPane.showMessageDialog(null, "Impossibile prelevare soldi");
        else
            conto-=soldi;        
    }
    
    void versamento(double soldi){
        conto+=soldi;
    }
    
    double leggoConto(){
        return conto;
    }
}
