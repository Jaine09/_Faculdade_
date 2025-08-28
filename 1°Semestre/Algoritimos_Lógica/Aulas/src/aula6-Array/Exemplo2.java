package aula6;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        int tamanho = 10; // indice é diferente de tamanho o indicice sempre é tamanho-1
        float[] vetor = new float[tamanho];

        // atribuindo valor manualmente
        vetor[0] = 8.5f;
        vetor[1] = 6.2f;
        vetor[2] = 5.3f;
        vetor[3] = 9.5f; // f de float, para dizer para o java que é do tipo float
        vetor[5] = 3.5f; // o indice anterior fica com 0

        System.out.println("VALOR ATRIBUIDO MANUALMENTE");
        System.out.println("vetor[0] = " + vetor[0]);
        System.out.println("vetor[1] = " + vetor[1]);
        System.out.println("vetor[2] = " + vetor[2]);
        System.out.println("vetor[3] = " + vetor[3]);
        System.out.println("vetor[4] = " + vetor[4]);
        System.out.println("vetor[5] = " + vetor[5]);

        System.out.println("\n ---------------------------------- \n");
        System.out.println("FEITO COM LAÇO DE REPETIÇÃO");
        for(int i= 0; i < vetor.length; i++){
            System.out.printf("vetor[%d] = %.2f \n", i, vetor[i]); // os elementos serão apresentados na ordem
        }

        System.out.println("\n ---------------------------------- \n");
        System.out.println("COMPARANDO PARA VERIFICAR SE A NOTA É MAIOR QUE A MÉDIA");
        Scanner input = new Scanner(System.in);
        System.out.println("Média: ");
        float media = input.nextFloat();

        for(int i=0; i < vetor.length; i++){
            if(vetor[i] > media){
                System.out.printf("Média: %.1f \n", vetor[i]);
            }
        }
    }
}
