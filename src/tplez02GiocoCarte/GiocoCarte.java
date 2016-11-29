/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez02GiocoCarte;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GiocoCarte {

    static Mazzo miomazzo;
    static int poscartaMazzo=0;
    static Carta cartacorrente;
    static double punteggioCorrente;
    
    public static void main(String[] args) {
        
        miomazzo=new Mazzo(40);        
        miomazzo.mischia();
        
        String nomecarta="Elenco carte mazzo\n";
        for(int i=0;i<40;i++){
            nomecarta+=miomazzo.getCartaIndex(i).getNome()+"\n";
        }
        
        Giocatore p1= new Giocatore("Lisa");
        Giocatore p2= new Giocatore("Ciao");
        giocata(p1);
        giocata(p2);
        
        double r1,r2;
        r1=p1.dammiPunteggio();
        r2=p2.dammiPunteggio();
        String msg="";
        if(r1<r2)
            msg="Vince "+ p2.getNome();
        if(r2<r1)
            msg="Vince "+p2.getNome();
        if(r1==r2)
            msg="Pari tra "+ p1.getNome()+" e "+p2.getNome();
        
        System.out.println(msg);
    }
    
    static  public void giocata(Giocatore p1){
        // inizio giocatore 1
        boolean avanti=true;
        while(avanti==true){
          cartacorrente=miomazzo.getCartaIndex(poscartaMazzo++);
          //la passo a p1
          p1.prendeCarta(cartacorrente);
            //chiedo quanti punti ha
            punteggioCorrente=p1.dammiPunteggio();
            //vedo anche
            System.out.println(punteggioCorrente+" - "+cartacorrente.getNome());
            //codice per terminare gioco
            if(punteggioCorrente>=8){
                avanti=false;
                p1.seiFuori();
            }    
            else{
                //chiedo se vuole continuare
                String input = JOptionPane.showInputDialog("Vuoi continuare?\n Vuoto continua scrivi qualsiasi carattere");
                if(input.equals("")==false)
                 avanti=false;
            }    
        } //fine gioco giocatore p1
    }
    
}
