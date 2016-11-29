/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplez02GiocoCarte;

/**
 *
 * @author tss
 */
public class Mazzo {

    private Carta mazzo[];
    private int numcarte; //numero carte del mazzo
    
    public Mazzo(int numcarte) {
        this.numcarte=numcarte;
        //creo l'array
        mazzo=new Carta[numcarte];
        //creare tot carte e inserirle nel mazzo
        
        String semecarta[]={"","Picche","Fiori","Quadri","Cuori"};
        int valore=1;
        int seme=1;
       
        for(int i=1;i<=numcarte;i++){
                //dopo 10 ricominci a 1 e poi cambi il seme
                String nomecarta=valore+" di "+semecarta[seme];
                Carta carta= new Carta(valore, seme, nomecarta);
                mazzo[i-1]=carta;
                valore++;
                
                //se questo elemento è sulla decina, resetto valo e seme
                //[se sono sul 10, rimetto valore a 1 e incremento il seme]
                if(i % (numcarte/4)==0){
                    seme++;
                    valore=1;
                }
        }
    }

    public Carta[] getMazzo() {
        return mazzo;
    }
    
    public int getNumcarte() {
        return numcarte;
    }

    public  Carta getCartaIndex(int i){
        Carta c=null;
        c=mazzo[i];
        return c;
    }
    
    public  void mischia(){
        //con ciclo di for di 1000 giri
        for(int i=0; i<2000; i++){
            //pesco due nume a casa da 0 a 39
             //e scambio le due carte corrispondenti
            int caso1=(int)Math.floor(Math.random()*numcarte);
            int caso2=(int)Math.floor(Math.random()*numcarte);
           
            Carta cartainmano=mazzo[caso1];
            mazzo[caso1]=mazzo[caso2];
            mazzo[caso2]=cartainmano;
        }    
    }
}
