package aula4;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("início: ");
        int inicio = input.nextInt();
        System.out.print("Fim: ");
        int fim = input.nextInt();

        if(inicio < fim){
            for(int i = inicio; i <= fim; i++){
                if(i%2 == 1){
                    System.out.println(i + " é ímpar");
                }
            }
        } else if (fim < inicio){
            for(int i = inicio; i >= fim; i--){
                if(i%2 == 0){
                    System.out.println(i + " é par");
                }
            }
        } else {
            System.out.println("o início e o fim são iguais");
        }

        input.close();
    }
}
