/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.util.Date;

/**
 *
 * @author tss
 */
public class Prestito {
    
    private int codLibro;
    private int codCliente;
    private String datapreso=new Date().toString();
    private String datarestituito="";
    boolean reso=false;
    String note;

    public Prestito(int codCliente, int codLibro, String note) {
        this.codLibro = codLibro;
        this.codCliente = codCliente;
        this.note = note;
    }

    public int getCodLibro() {
        return codLibro;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public String getDatapreso() {
        return datapreso;
    }

    public String getDatarestituito() {
        return datarestituito;
    }

    public boolean isReso() {
        return reso;
    }

    public String getNote() {
        return note;
    }

    public void setDatarestituito(String datarestituito) {
        this.datarestituito = datarestituito;
    }

    public void setReso(boolean reso) {
        this.reso = reso;
    }

    public void setNote(String note) {
        this.note = note;
    }

    
    
    
    
}
