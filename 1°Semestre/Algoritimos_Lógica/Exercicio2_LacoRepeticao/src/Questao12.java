//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 1;
        int contador = 0;

        while(i <= 20){
            System.out.print("Digite o " + i + "° número: ");
            int num = entrada.nextInt();
            
            if(num%2 == 0){
                contador++;
            }

            i++;
        }

        System.out.print("Você digitou " + contador + " números pares");

        entrada.close();
    }
}
