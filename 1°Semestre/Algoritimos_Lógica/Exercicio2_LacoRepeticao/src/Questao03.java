// 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        for(int i = 1; i <= 10; i++){
            System.out.println(nome);
        }

        entrada.close();
    }
}
