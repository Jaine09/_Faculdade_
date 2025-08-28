/*Faça um programa que leia um número natural N e calcule a soma abaixo (lembre-se de que tanto as divisões
quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente. */

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = entrada.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }

        System.out.println("A soma da série é: " + soma);

        entrada.close();
    }
}
