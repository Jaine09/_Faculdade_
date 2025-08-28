// 9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. 

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;;

        for (int i = 1; i <= 2; i++) {
            System.out.println("Digite o nome da pessoa " + i + ": ");
            String nome = entrada.nextLine();
            System.out.println("Digite a idade de " + nome + ": ");
            int idade = entrada.nextInt();
            entrada.nextLine(); 

            if (idade < idadeMaisNova) {
                nomeMaisNovo = nome;
                idadeMaisNova = idade;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
        entrada.close();
    }
}
