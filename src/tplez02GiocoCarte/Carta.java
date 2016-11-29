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
public class Carta {
    
    private int valore; //numero della carta- 7
    private int seme; //seme della carta. [1-2-3-4)cuori]
    private String nome; //composto in fase di creazione [3 di picche]

    public Carta(int valore, int seme, String nome) {
        this.valore = valore;
        this.seme = seme;
        this.nome = nome;
    }

    public int getValore() {
        return valore;
    }

    public int getSeme() {
        return seme;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
