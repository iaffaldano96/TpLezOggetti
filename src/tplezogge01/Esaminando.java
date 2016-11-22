/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplezogge01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Esaminando {
    
    //proprietà-attributi dell'oggetto
    String cognome;
    String nome;
    private int voto;

    public Esaminando(String cognome, String nome) {
        this.cognome=cognome;
        this.nome=nome;
    }
    
    String cometiChiami() {
        String ris="";
        ris="Ciao, il mio cognome è "+cognome+" e il nome è "+nome;
        return ris;
    }

    public void impostavoto(int voto){
        if(voto>=0 && voto<=100)
            this.voto=voto;
        else
            JOptionPane.showMessageDialog(null, "Valore errato");
    }
    
    public int leggoVoto(){
        return voto;
    }
    
    boolean seipiubravo(Esaminando avver){
        boolean ris=false;
        if(voto>avver.leggoVoto())
            ris=true;
        return ris;
    }
   
}
