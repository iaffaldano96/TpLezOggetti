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
public class Cliente extends Persona {

    private int codCliente;

    public Cliente(String cognome, String nome, int codCliente) {
        super(cognome, nome);
        this.codCliente = codCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }
    
    
}