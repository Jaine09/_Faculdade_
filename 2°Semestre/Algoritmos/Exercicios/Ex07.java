/*Elaborar um programa para construir um
vetor chamado elementos[ ] que receba
somente 15 números inteiros e
apresente ao final apenas os elementos
que forem pares. */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] elementos = new int[15];
        int[] pares = new int[15];
        int contadorPares = 0;
        
        System.out.println("Digite 15 números inteiros: ");
        for(int i = 0; i < elementos.length;i++){
            elementos[i] = entrada.nextInt();
        }

        System.out.println("Números pares digitados: ");
        for(int i = 0; i < elementos.length;i++){
            if(elementos[i] % 2 == 0){
                pares[contadorPares] = elementos[i];
                contadorPares++;
            }
        }
        for(int i = 0; i < contadorPares;i++){
            System.out.println(pares[i]);
        }
    }
}
