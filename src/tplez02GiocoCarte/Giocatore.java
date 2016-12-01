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
    ArrayList<Carta>carteinMano;
    int punti=0;

    public String getNome() {
        return nome;
    }
    
    
    public Giocatore(String nome) {
        this.nome=nome;
        //carte array list di carte per agg o toglie le carte dall'array
        carteinMano= new ArrayList<Carta>();
    }
    
    public String vediCarteinMano(){
        String ris="Non ho carte in mano oppure ho  rinunciato";
        String elenco="";
        for(int i=0;i<carteinMano.size();i++){
            elenco+= carteinMano.get(i).getNome()+"\n";
        }
        //ora mi trovo con elenco vuoto o con le carte
        //se è ancora vuoto ritorno ris
        //altrimenti assegno a ris, elenco
        if(elenco.equals("")==true)
            return ris;
        else
            return elenco;
    }

    public int getPunti() {
        return punti;
    }
    
    //metodo per aggiungere un carta che viene passata nell'array list
    public  void prendeCarta(Carta c){
        carteinMano.add(c);  
    }
    
    public  void seiFuori(){
            carteinMano.clear();
    }        
    
    //metodo per il settemezzo per avere il conto dei punti con le carte che ho nell'array list
    public  double dammiPunteggio(){
        double ris=0;
        //ciclo tutti gli ele fino a size()
        for(int i=0;i<carteinMano.size();i++){
            //prendo una carta per volta, la i - esima
            Carta c=carteinMano.get(i);
            if(c.getValore()<8)
                ris+=c.getValore();
            else
                ris+=0.5;
        }
        return ris;
    }
    
}
