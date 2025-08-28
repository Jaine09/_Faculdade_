/*Elaborar um programa em Java que faça
uma matriz 3x3 de números inteiros
digitados pelo usuário. Exibir a matriz,
somar os elementos da diagonal e exibir
a soma.
 */

import java.util.Scanner;

public class Ex14_Matrizes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] matriz = new int[3][3];

        System.out.println("Digite os números para preencher a metriz");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int somaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaDiagonal += matriz[i][i];
        }

        System.out.println("Soma da diagonal : " + somaDiagonal);

    }
}
