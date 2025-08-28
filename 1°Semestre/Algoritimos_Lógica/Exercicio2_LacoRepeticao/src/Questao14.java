// 14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100, quantos estão entre 101 e 200 e quantos são maiores de 200.

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador100 = 0;
        int contador101 = 0;
        int contador200 = 0;

        for(int i = 1; i <= 20; i++){
            System.out.print("Digite o " + i + "° número: ");
            int num = entrada.nextInt();

            if (num <= 100) {
                contador100++;
            }else if (num <=200){
                contador101++;
            }else{
                contador200++;
            }
        }

    System.out.println("Você digitou " + contador100 + " números entre 0 e 100.");
    System.out.println("Você digitou " + contador101 + " números entre 101 e 200.");
    System.out.print("Você digitou " + contador200 + " números maiores de 200.");

    entrada.close();
    }
}
