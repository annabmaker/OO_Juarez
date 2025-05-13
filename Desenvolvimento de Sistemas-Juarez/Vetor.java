/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int v[]= new int [2];
       String st = "Digite 2 numeros:";
       for(int i=0; i<2; i++);{
        st=JOptionPane.showInputDialog(null,st);
        int i = 0;
        v [i]= Integer.parseInt(st);
        
    }
       System.exit(0);
    }
    
}
