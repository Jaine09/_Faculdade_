/*Elaborar um programa em Java para
criar uma matriz 3x4, para o usuário
preencher com números inteiros.
Depois, exibir a matriz, mostrar quantos
números ímpares existem, e quais são
eles. */

import java.util.Scanner;

public class Ex15_Matrizes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int [][] matriz = new int [3][4];

        System.out.println("Digite os números para preencher a matriz:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Essa é sua matriz:");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0){

                }
            }
        }

    }
}
