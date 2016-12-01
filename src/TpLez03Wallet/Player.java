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
public class Player {
    
    private String nome;
    private Wallet portafoglio=new Wallet() ;

    public Player() {
    }

    public Player(String nome) {
        this.nome = nome;
    }

    public Player(String nome,Moneta moneta) {
        this.nome = nome;
        this.portafoglio.aggMoneta(moneta);        
    }
    
    public Wallet getMyWallet(){
        return portafoglio;
    }
    
    public String getNome() {
        return nome;
    }
    
}
