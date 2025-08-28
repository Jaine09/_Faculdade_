/*Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
resultado obtido. Use o laço WHILE */

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um númmero: ");
        int n = entrada.nextInt();

        int valorAnterior = 0;
        int soma  = 0;
        int i = 0;

        while (i<=n) {
            valorAnterior =+ i;
            soma = valorAnterior + soma;
            i++;
        }
        System.out.println("A soma de todos valores é: " + soma);

        entrada.close();
    }
}
