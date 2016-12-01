/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TpLez03Wallet;

/**
 *
 * @author tss
 */
public class GestioneWallet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //creo due persone
        Moneta moneta= new Moneta(40);
        Player p1= new Player("Lisa",moneta);
        Player p2= new Player("Francesca");
        
        //credo dei soldi e glieli do
        moneta= new Moneta(20);
        p1.getMyWallet().aggMoneta(moneta);
        p2.getMyWallet().aggMoneta(moneta);
        
        moneta= new Moneta(20);
        p1.getMyWallet().aggMoneta(moneta);
        
        
        System.out.println("Soldi del player 1: "+p1.getNome()+" - "+p1.getMyWallet().quantiSoldi());
        p1.getMyWallet().togliMoneta(20);
        System.out.println("Soldi attuali del player 1: "+p1.getNome()+" - "+p1.getMyWallet().quantiSoldi());
        
        System.out.println("Soldi del player 2: "+p2.getNome()+" - "+p2.getMyWallet().quantiSoldi());
        //tipo: do 1 2 5 10 20 a tutti e due
        //quando creo persona, creo wallet
        //creo metodo per far si che il play sa quanti soldi ha
        //e a "Quanti pezzi da 10? 1
        System.out.println("Il player 1 ha "+p1.getMyWallet().quantiPezzida(20)+" pezzo/i da 20");
        System.out.println("Il player 2 ha "+p2.getMyWallet().quantiPezzida(20)+" pezzo/i da 20");
        //p1.addmoneta(5);
        
        
    }
    
}
