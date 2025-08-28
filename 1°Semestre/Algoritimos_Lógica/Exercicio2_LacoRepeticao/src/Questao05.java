// 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite dez números: ");
        int soma = 0;

        for(int i = 1; i <= 10; i++){
            int numero = entrada.nextInt();
            soma = soma +  numero;
        }

        System.out.print("A soma de todos os números digitados é: " + soma);

        entrada.close();
    }
}
