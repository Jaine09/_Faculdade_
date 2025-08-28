/*Desenvolver um programa que leia cinco
elementos de um vetor A. No final,
apresente o total da soma de todos os
elementos que sejam ímpares.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 5 númeos inteiros: ");
        int [] num = new int [5];
        int soma = 0;
        int numAnterior;
        
        for(int i = 0; i < num.length; i++ ){
            num[i] = entrada.nextInt();

            if(num[i]%2 != 0){
                numAnterior = num[i];
                soma += num[i];
            }
        }

        System.out.println("A soma de todos os números ímpas é: " + soma);
    }
}
