/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpLez03Wallet;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import tplez02GiocoCarte.Carta;

/**
 *
 * @author tss
 */
public class Wallet {
    
    private ArrayList<Moneta>elencoMonete= new ArrayList<Moneta>();
    
    public ArrayList<Moneta> getMonete() {
       return elencoMonete;
    }
    
    public  void aggMoneta(Moneta mon){
        elencoMonete.add(mon);
    }
    
    public  void togliMoneta(double valore){
        for(int i=0;i<elencoMonete.size();i++){
           if(elencoMonete.get(i).getValore()==valore){
               elencoMonete.remove(i);
               break;
           }   
        }
        
    }
    
    public int  quantiPezzida(double valore){
        int cont=0;
        for(int i=0;i<elencoMonete.size();i++){
            if(elencoMonete.get(i).getValore()==valore)
                cont++;
        }    
        return cont;
    }
    
    public double quantiSoldi(){
        double somma=0;
        for(int i=0;i<elencoMonete.size();i++){
           somma+=elencoMonete.get(i).getValore();
        }
        return somma;
    }
    
}
