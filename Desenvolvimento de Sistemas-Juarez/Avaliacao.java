/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Avaliacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String avaliacao="Informe sua nota:";
     avaliacao = JOptionPane.showInputDialog(null, avaliacao);
     switch (avaliacao)
     {case  "A":
      avaliacao= "Promovido!";
       break;
       
     case "b":
         avaliacao= "Promovido!";
         break;
         
     case "c":
        avaliacao= "Promovido!";
          break;
     case "d":
         avaliacao="Retido!";
         break;
     case "e":
         avaliacao="Retido!";
         break;
     default:
         avaliacao="Avaliação não existe, digite a letra correta!";
         JOptionPane.showMessageDialog(null, avaliacao, "Error", 0);
         System.exit(0);
         
         JOptionPane.showMessageDialog(null,avaliacao, "avaliacao",1);
         System.exit(0);
         
         
     }  
     }
    
}
