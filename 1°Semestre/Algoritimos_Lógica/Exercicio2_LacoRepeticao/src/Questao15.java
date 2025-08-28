//15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado.

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            int num = 0;
            int soma = 0;

        do {
            System.out.println("Digite um número");
            num = entrada.nextInt();

            if (num >= 0) {
               soma += num; 
            }
          
        } while (num >= 0);

        System.out.println("A soma de todos os valores digitados é: " + soma);

        entrada.close();
    }
}
