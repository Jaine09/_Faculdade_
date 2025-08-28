// 13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100. 

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 1;
        int contador = 0;

        while (i <= 20) {
            System.out.print("Digite o " + i + "° número: ");
            int num = entrada.nextInt();

            if(num <= 100){
                contador++;
            }
            i++;
        }

        System.out.print("Você digitou " + contador + " números entre 0 e 100");


        entrada.close();
    }
}
