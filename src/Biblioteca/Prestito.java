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
public class Prestito {
    
    private int codCliente;
    private int codLibro;
    private String datapreso;
    private String dataconse;

    public Prestito(int codCliente, int codLibro, String datapreso) {
        this.codCliente = codCliente;
        this.codLibro = codLibro;
        this.datapreso = datapreso;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public int getCodLibro() {
        return codLibro;
    }

    public String getDatapreso() {
        return datapreso;
    }

    public String getDataconse() {
        return dataconse;
    }

    public void setDataconse(String dataconse) {
        this.dataconse = dataconse;
    }
    
    
    
}
