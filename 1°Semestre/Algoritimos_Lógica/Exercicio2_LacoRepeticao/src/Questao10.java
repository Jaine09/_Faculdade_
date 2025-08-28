//10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número para ver sua tabuada: ");
        int num = entrada.nextInt();

        for(int i = 0; i <= 10; i++){
            int mult = num*i;
            System.out.println(num + " X " + i + " = " + mult);
        }
        
        entrada.close();
    }
}
