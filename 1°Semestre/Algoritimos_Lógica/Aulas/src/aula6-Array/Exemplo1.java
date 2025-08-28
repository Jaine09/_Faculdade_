package aula6;
import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        int t = tamanhoVetor();
        int[] v = criarVetor(t);
        imprimir(v);
    }

    public static int tamanhoVetor(){
        System.out.println("*-* TAMANHO DO VETOR *-*");
        System.out.println("**********************");

        Scanner input = new Scanner(System.in);
        System.out.println("Tamanho: ");
        int tamanho = input.nextInt();

        return tamanho;
    }

    // o retorno é um array de int
    public static int[] criarVetor(int tamanho){
        System.out.printf("*-* CRIANDO UM VETOR DE %d ELEMENTOS \n*-*", tamanho);
        System.out.println("************************************************");
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[tamanho];
        
        for(int i =0; i < tamanho; i++){
            System.out.printf( "vetor[%d]", i);
            vetor[i] = input.nextInt();
        }

        return vetor;

    }

    public static void imprimir(int[] vetor){
        System.out.println("*-* IMPRIMIR *-*");
        System.out.println("**********************");

        for(int i=0; i < vetor.length; i++){
            System.out.printf("vetor[%d] : %d \n", i, vetor[i]);
        }

    }
    
}