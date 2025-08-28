//6) Leia a idade de 20 pessoas e exiba a soma das idades. 

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int soma = 0;
        for(int i = 1; i <= 20; i++){
            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();
            soma = soma + idade;
        }

        System.out.println("A soma de todas as idades é: " + soma);
       
       entrada.close();
    }
}
