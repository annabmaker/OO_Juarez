/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meuprimeiroprojetoanna;

/**
 *
 * @author Aluno CA
 */
public class MeuPrimeiroProjetoAnna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Soma s = new Soma();
      
        System.out.println(s.calcula(10, 5));
        
        divisao d = new divisao();
        System.out.println(d.calcula(10, 5));
        
        Subtra��o b = new Subtra��o();
        System.out.println(b.calcula(10 , 5));
        
        Multiplica��o m = new Multiplica��o();
        System.out.println(m.calcula(10, 5));
    }
    
}
