/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tplezogge01;

/**
 *
 * @author tss
 */
public class TpLezOgge01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String output;

        Esaminando alunno1 =new Esaminando("Iaffaldano","Lisa");
        alunno1.cognome="Iaffaldano";
        alunno1.nome="Lisa";
        alunno1.impostavoto(80);
        output=alunno1.cometiChiami()+". Voto: "+alunno1.leggoVoto();
        System.out.println(output);

        Esaminando alunno2 =new Esaminando("Ciao","Nome"); 
        alunno2.impostavoto(90);
        output=alunno2.cometiChiami()+". Voto: "+alunno2.leggoVoto();
        System.out.println(output);

        if(alunno1.seipiubravo(alunno2)==true)
            output= "Brava "+alunno1.cognome;
        else
            output= "Bravo "+alunno2.cognome;
        System.out.println(output);
    }
    
}
