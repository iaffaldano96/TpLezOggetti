/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

/**
 *
 * @author tss
 */
public class Persona {
    private String cognome;
    private String nome;

    public Persona(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }
    
}
