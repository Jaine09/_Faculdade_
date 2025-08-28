/*. Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa deve determinar
e imprimir o maior deles. Use o laço FOR */

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        int maiorNumero = 0;
        System.out.println("Digite 10 número");
        
        for(int i = 1; i <= 10; i++){
            System.out.print(i + "° :");
            int num = entrada.nextInt();

            if (num >= maiorNumero) {
                maiorNumero = num;
            }
        }

        System.out.println("O maior número é: " + maiorNumero);

        entrada.close();
        
    }
}
