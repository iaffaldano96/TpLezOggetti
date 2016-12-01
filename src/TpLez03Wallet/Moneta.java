/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpLez03Wallet;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Moneta {
    
    private double valore;

    public Moneta(double valore) {
           
        /*if(valore!=0.05 || valore!=0.10 || valore!=0.20 || valore!=0.50 || 
            valore!=1 || valore!=2 || valore!=5 || valore!=10 || valore!=20 || valore!=50)
            
            JOptionPane.showMessageDialog(null,"Non hai inserito il valore correttamente");
        else      */     
            this.valore = valore;
    }

    public double getValore() {
        return valore;
    }
   
}
