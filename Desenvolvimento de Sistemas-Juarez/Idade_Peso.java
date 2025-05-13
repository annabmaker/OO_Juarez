/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idade_peso;

import javax.swing.JOptionPane;

/**
 *
 * @author annab
 */
public class Idade_Peso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String sexo = JOptionPane.showInputDialog("Digite seu sexo (M/F):");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (em metros):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso (em kg):"));

       
       if(sexo == "M" || sexo == "m"){
            if(altura >= 1.80) {
                if(peso >= 75) {
                    JOptionPane.showMessageDialog(null, "Aceito");
                } else {
                    JOptionPane.showMessageDialog(null, "Não aceito");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não aceito");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não aceito");
        }
    }
}
   
    

