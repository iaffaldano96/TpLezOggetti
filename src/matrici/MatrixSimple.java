/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrici;

/**
 *
 * @author tss
 */
public class MatrixSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Matrix m= new Matrix(10);
        
        //tiro a caso tra 1 e 100 e
        //metto il numero in valori e stampo
        double num=Math.random()*10*10;
        num=Math.round(num);
        int r=(int)Math.floor(num/10);
        int c;
        
        c=(int)Math.floor((num%10)-1);
        m.valori[r][c]=String.valueOf(num);
        m.valori[r][c]=num+"";
        System.out.println(m.printMatrix());
    }
    
}
