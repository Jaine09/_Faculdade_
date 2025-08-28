/*Fazer uma função chamada somatoria que tem como parâmetro de entrada um número inteiro positivo
N e fornece como saída a soma de todos os números inteiros positivos menores ou iguais a N.
Exemplo: se N for 3, a função deve retornar 6, que é a soma de 1 + 2 + 3. */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número parra ver a soma de todos os números inteiros positivos menores ou iguais: ");
        int num = entrada.nextInt();
        System.out.println("A soma total deu: " + somatoria(num));
    }

    public static int somatoria(int n){
        int soma = 0;
        for (int i = 0; i <= n; i++){
            soma += i;
        }

        return soma;
    }
}
