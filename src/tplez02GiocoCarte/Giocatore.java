/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez02GiocoCarte;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Giocatore {
    
    String nome="Lisa";
    ArrayList<Carta>carte;
    int punti=0;

    public String getNome() {
        return nome;
    }
    
    
    public Giocatore(String nome) {
        this.nome=nome;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
        //carte array list di carte per agg o tglie le carte dall'array
        carte= new ArrayList<Carta>();
    }
    
    //metodo per aggiungere un carta che viene passata nell'array list
    public  void prendeCarta(Carta c){
        carte.add(c);  
    }
    
    public  void seiFuori(){
            carte.clear();
    }        
    
    //metodo per il settemezzo per avere il conto dei punti con le carte che ho nell'array list
    public  double dammiPunteggio(){
        double ris=0;
        //ciclo tutti gli ele fino a size()
        for(int i=0;i<carte.size();i++){
            //prendo una carta per volta, la i - esima
            Carta c=carte.get(i);
            if(c.getValore()<8)
                ris+=c.getValore();
            else
                ris+=0.5;
        }
        return ris;
    }
    
}
