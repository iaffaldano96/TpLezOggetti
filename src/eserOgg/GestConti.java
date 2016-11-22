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
public class GestConti {

    static Correntista arcc[];
    public static void main(String[] args) {

        int numcc;
        numcc=Integer.parseInt(JOptionPane.showInputDialog("Quanti correntisti?"));
        arcc=new Correntista[numcc];
        
        for(int i=0;i<arcc.length; i++){
            String nominativo=JOptionPane.showInputDialog("#"+(i+1)+"nome?");
            int anno=Integer.parseInt(JOptionPane.showInputDialog("Anno di nascista?"));
            Correntista cc=new Correntista(nominativo, anno);
            double conto=Double.parseDouble(JOptionPane.showInputDialog(" Quanto versi ?",0));
            cc.versamento(conto);
            arcc[i]=cc;

        }
        presentacc();
    } 

    static void presentacc() {
        for(int i=0;i<arcc.length; i++){
            arcc[i].stampaNomi();
        }
    }
}
