// 7) Leia a idade de 20 pessoas e exiba a média das idades. 

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int soma = 0;
       int media;
        for(int i = 1; i <= 20; i++){
            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();
            soma = soma + idade;
        }

        media = soma/20;
        System.out.println("A média de todas as idades é: " + media);
       
       entrada.close();
    }
}
