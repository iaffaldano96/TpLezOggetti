/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserOgg01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class ContoCorrOgetto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String in,ann;
        int anno;
        in= JOptionPane.showInputDialog("Inserire nominativo");
       
        ann=JOptionPane.showInputDialog("Inserire anno di nascita");
        anno=Integer.parseInt(ann);
        Correntista cor= new Correntista(in, anno);
        
        System.out.println(cor.stampaNomi());
        System.out.println("Conto valore iniziale: "+cor.leggoConto());
        cor.versamento(50);
        System.out.println("Conto valore attuale: "+cor.leggoConto());
        cor.prelievo(20);
        System.out.println("Conto valore finale: "+cor.leggoConto());
    }
    
}
