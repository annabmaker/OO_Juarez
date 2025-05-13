/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maior_idade;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Maior_Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String id= "Verifique sua maioridade:";
          id = JOptionPane.showInputDialog(null, id);
        int idade = Integer.parseInt(id);
        if(idade >= 18){
            id="Permitido!";
            JOptionPane.showMessageDialog( null, id,"Permitido",1);
        } else{ 
            id = "Negado!";
            JOptionPane.showConfirmDialog(null, id,"Negado", 0);
            
        }
          
                }
        
        
    
    
}
