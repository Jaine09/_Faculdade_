/*Faça um algoritmo para ler 20 números e armazenar em um
vetor. Após a leitura total dos 20 números, o algoritmo deve
escrever esses 20 números lidos na ordem inversa. */

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite vinte números:");

        int[] vetor1 = new int[20];

        for(int i = 0; i < vetor1.length; i++){
            vetor1[i] = entrada.nextInt();
        }

        for(int i = 0; i < vetor1.length; i++){
            System.out.println(vetor1[i]);
        }

        System.out.println("Vetor ao inverso: ");

        for(int i = 19; i >= 0; i--){
            System.out.println(vetor1[i]);
        }
    }
}
