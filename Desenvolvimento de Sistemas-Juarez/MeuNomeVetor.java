/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meunomevetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class MeuNomeVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String v[] = new String[4];
       String st = "Digite seu nome:";
       
       for(int i=0; i< 4; i++){
           st =JOptionPane.showInputDialog(null,st);
           v[i] =String.format(st, (Object[]) args);
    }
        System.exit(0);
    }  
}
