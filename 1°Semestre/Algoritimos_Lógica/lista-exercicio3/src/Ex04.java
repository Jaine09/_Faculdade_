/*Fazer um programa que lê um número inteiro positivo N e imprime a divisão do produto dos n primeiros
números positivos pela soma dos n primeiros números positivos.
Em outras palavras, você deve dividir o fatorial pela somatoria do número. Obrigatório utilizar as
funções elaboradas nos exercícios 2 e 3. */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite três números para retornar o menor:");
        int num1 = entrada.nextInt();
        float soma = somatoria(num1);
        float fatorial = fatorial(num1);

        System.out.print("O resultado da divisão foi: " + divisao(fatorial, soma));
    }

    public static float somatoria(float    
         k[] n){
        float soma = 0;
        for (int i = 0; i <= n; i++){
            soma += i;
        }

        return soma;
    }

    public static float fatorial(float n){
        int numAnterior;
        float resultado = 1;
        for(int i = 1; i <= n; i++){
            numAnterior = i;
            resultado = resultado * numAnterior;
        }

        return resultado;
    }

    public static float divisao(float fatorial, float soma){
        float resultado = fatorial(fatorial)/somatoria(soma);

        return resultado;
    }
}
