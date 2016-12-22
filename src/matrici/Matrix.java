/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrici;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Matrix {
    
    int size;
    int [][] matrice;
    String [][] valori;

    public Matrix(int size) {
        this.size=size;
        this.matrice = new int[size][size];
        this.valori = new String[size][size];
        int num=1;
        for(int r=0;r<size;r++){
            for(int c=0;c<size;c++){
                matrice[r][c]=num;
                num++;
                valori[r][c]="-";
            }
        }                       
    }
    
    public String printMatrix(){
        String report="";
        for(int r=0;r<size;r++){
            for(int c=0;c<size;c++){
                report+=matrice[r][c]+"\t";
            }    
            report+="\n";    
        }     
        report+="\n"; 
        for(int r=0;r<size;r++){
            for(int c=0;c<size;c++){
                report+=valori[r][c]+"\t";
            }    
            report+="\n";    
        }     
        
        return report;
    }
    
     
    
}
