/*Calcular e mostrar a média aritmética dos números pares compreendidos entre 13 e 73. Utilize o laço que
lhe for mais conveniente. */

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorAnterior = 0;
        int media;
        int soma = 0;

        for(int num = 13; num <= 73; num++){
            if(num%2 == 0){
                valorAnterior = num;
                soma = soma + valorAnterior;
            }
        }

        media = soma/30;
        System.out.print("A média aritmética dos números pares entre 13 e 73 é: " + media);
        
        entrada.close();
    }
    
}
