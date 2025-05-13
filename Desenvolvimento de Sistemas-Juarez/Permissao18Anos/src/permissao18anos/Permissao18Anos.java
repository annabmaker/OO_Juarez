/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package permissao18anos;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Permissao18Anos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msg="Informe sua idade:";
        msg=JOptionPane.showInputDialog(null,msg);        
         int idade =Integer.parseInt(msg);
        if(idade >=18){
           msg="Permissão concedida!";
           JOptionPane.showMessageDialog(null,msg,"Permissão",1);
           System.exit(0);           
        }else{
            msg="Permissão negada!";
            JOptionPane.showMessageDialog(null, msg,"Negada",0);
        }
    }
    
}
