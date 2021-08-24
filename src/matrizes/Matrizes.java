package matrizes;

import javax.swing.*;
import java.util.Scanner;

public class Matrizes {

    /*
    São arranjos bidimensionais ("vetor de vetores");
    Arranjo (array) é uma estrutura de dados:
        - homogênea (dados do mesmo tipo);
        - ordenada (elementos acessados por meio de posições);
        - alocada de uma vez só, em bloco contíguo de memória;
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] mat = new int [n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        /*
        Ordem de gravação dos dados (esq p/ dir, cima p/ baixo):
        [0,0][0,1][0,2]
        [1,0][1,1][1,2]
        [2,0][2,1][2,2]
         */
        System.out.println("---------------");

        System.out.println("Main diagonal: ");

        for (int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        System.out.println("---------------");

        System.out.println("Negative numbers: ");

        int count = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

        scanner.close();
    }
}