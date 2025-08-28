/*Ler um vetor A de 10 números. Após, ler mais um número e
guardar em uma variável X. Armazenar em um vetor M o
resultado de cada elemento de A multiplicado pelo valor X. Logo
após, imprimir o vetor M.
 */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] a = {9,20,40,5,60,80,70,1,13,22};
        
        System.out.println("Digite um número para multiplicar com os vetores: ");
        int x = entrada.nextInt();

        int[] m = new int[10];

        for(int i = 0; i < m.length; i++){
            m[i] = a[i]*x; 
        }

        for(int i = 0; i<m.length; i++){
            System.out.println("A multiplicação de " + x + " com "+ a[i] + " é: "+ m[i]);
        }

        
    }
}
