/*Fazer uma função chamada fatorial que tem como parâmetro de entrada um número inteiro positivo n
e fornece como saída o fatorial desse número.
Exemplo: se N for 5, a função deve retornar 120, que é a multiplicação de 1 * 2 * 3 * 4 * 5 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número para ver o seu fatorial: ");
        int num = entrada.nextInt();
        System.out.println("O fatorial de " + num + " é: " + fatorial(num));
        
    }

    public static int fatorial(int n){
        int numAnterior;
        int resultado = 1;
        for(int i = 1; i <= n; i++){
            numAnterior = i;
            resultado = resultado * numAnterior;
        }

        return resultado;
    }
}
