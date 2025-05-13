/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada_while;

import javax.swing.JOptionPane;



public class Tabuada_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num= Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
         int i = 1;
             while(i <= 10) {
            int resultado = num * i;
            JOptionPane.showMessageDialog(null, num + " x " + i + " = " + resultado);
            i++;
    }
    
    }
}
