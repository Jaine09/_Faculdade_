/*Ler um vetor Q de 10 posições (aceitar somente números
positivos). Mostre a seguir o valor do maior elemento de Q e a
respectiva posição que ele ocupa no vetor. */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 10 números ");
        int[] q = new int[10];

        for (int i = 0; i < q.length; i++) {

            do {
                System.out.println("Digite o " + (i + 1) + " número:");
                q[i] = entrada.nextInt();

                if (q[i] < 0) {
                    System.out.println("Digite somente números positivos:");
                }

            } while (q[i] < 0);
        }

        int posicao = q[0];
        int maiorElemento = 0;

        for (int i = 0; i < q.length; i++) {
            if(q[i] > posicao){
                posicao = q[i];
                maiorElemento = i;
            }
        }

        System.out.println("O maior elemento do vetor é: " + posicao);
        System.out.println("A posição do maior elemento é: " + maiorElemento);

    }
}
