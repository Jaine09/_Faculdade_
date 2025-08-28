package aula4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorAtual = 0;
        for(int i=1; i <= 10; i++){
            System.out.print("Digite um número: ");
            int num = entrada.nextInt();
            
            if(maiorAtual < num){
                maiorAtual = num;
            }
        }

        System.out.println("O maior número digitado foi: " + maiorAtual);
        entrada.close();
    }
}
