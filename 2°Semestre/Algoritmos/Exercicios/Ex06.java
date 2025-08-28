/*Construir um programa que crie dois
vetores contendo 5 números inteiros
fixos em cada posição deles. Em
seguida, exibir na tela todos os itens do
vetor A, todos os itens de vetor B e na
sequência a multiplicação de todos os
elementos do vetor A pelo vetor B,
criando um novo vetor para armazenar
esses resultados. */

public class Ex06 {
    public static void main(String[] args) {
        int [] a = {5,3,2,9,4};
        int [] b = {2,6,5,8,1};
        int [] mult = new int[5];

        System.out.println("Números do vetor A: ");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println("Números dos vetor B: ");
        for(int i = 0; i < b.length; i++){
           System.out.println(b[i]);
        }

        for(int i = 0; i < mult.length; i++){
            mult[i] = a[i] * b[i];
        }

        System.out.println("A multiplicação de A por B: ");
        for(int i = 0; i < mult.length; i++){
            System.out.println(mult[i]);
         }
    }
}
