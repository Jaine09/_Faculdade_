/*O mesmo exercício anterior, mas agora deve mostrar o menor
elemento do vetor e a respectiva posição dele nesse vetor. */

import java.util.Scanner;

public class Ex11 {
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
        int menorElemento = 0;

        for (int i = 0; i < q.length; i++) {
            if(q[i] < posicao){
                posicao = q[i];
                menorElemento = i;
            }
        }

        System.out.println("O maior elemento do vetor é: " + posicao);
        System.out.println("A posição do maior elemento é: " + menorElemento);

    }
}
