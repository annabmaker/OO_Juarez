/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriza.b;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class MatrizAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[][] A = new int[5][5];
        int[][] B = new int[5][5];

        // Leitura da matriz A usando JOptionPane
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                String input = JOptionPane.showInputDialog(
                    null,
                    "Digite o elemento A[" + (i+1) + "][" + (j+1) + "]:",
                    "Entrada da Matriz A",
                    JOptionPane.QUESTION_MESSAGE
                );
                try {
                    A[i][j] = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida! Será considerado 0.");
                    A[i][j] = 0;
                }
            }
        }

        // Construção da matriz B
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    B[i][j] = 3 * A[i][j];
                } else {
                    B[i][j] = 2 * A[i][j];
                }
            }
        }

        // Montar a string para exibir a matriz B usando concatenação simples
        String resultado = "Matriz B resultante:\n";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                resultado = resultado + B[i][j] + "\t";
            }
            resultado = resultado + "\n";
        }

        // Exibir a matriz B usando JOptionPane
        JOptionPane.showMessageDialog(null, resultado, "Matriz B", JOptionPane.INFORMATION_MESSAGE);
    }
}