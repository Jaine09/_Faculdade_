//4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes.

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite a quantidade de vezes para ele se repetir: ");
        int repeticao = entrada.nextInt();

        for(int i = 1; i <= repeticao; i++){
            System.out.println(nome);
        }

        entrada.close();
    }
}
