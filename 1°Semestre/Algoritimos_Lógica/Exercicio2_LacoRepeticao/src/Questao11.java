// 11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        for(int i=1 ; i <= 20; i++){
            System.out.print("Digite o " + i + "° número: ");
            int num = entrada.nextInt();

            if(num <= 8){
                contador++;
            }
        }

        System.out.println("Foi digitado " + contador + " números maiores que 8");

        entrada.close();
    }
}
