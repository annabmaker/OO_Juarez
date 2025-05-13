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
    
     
    public static void main(String[] args) {
        { String st = "Informe um numero 1 a 4 sendo 1 MB, 2 B, 3 R, 4 L:";
        st= JOptionPane.showInputDialog(null,st);
        int men = Integer.parseInt(st);
        switch(men)
        { case 1: 
                st= "MB";
            break;
        case 2:
            st="B";
            break;
        case 3:
            st="R";
            break;
        case 4:
            st="I";
            break;
        default:
            st= "Menção Invalida";
          JOptionPane.showMessageDialog(null,st,"ERRO", 0);
          System.exit(0);}
          st= "Sua menção é:"+st;
          JOptionPane.showMessageDialog(null,st,"Menção", 1);
        System.exit(0);
            
    
        }
    }
    
}
