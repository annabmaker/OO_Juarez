/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contagem_idadedowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author annab
 */
public class Contagem_idadeDoWhile {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        int i = 1;
        
        do {
            JOptionPane.showMessageDialog(null, "Contando até sua idade: " + i);
            i++;
        } while(i <= idade);
    }
}
    
    
