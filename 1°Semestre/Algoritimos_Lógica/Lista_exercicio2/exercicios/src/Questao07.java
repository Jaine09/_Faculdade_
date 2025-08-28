/*Escreva um programa que imprima todos os múltiplos de 7 menores que 200. Use o laço WHILE */

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 1;
        int multiplo = 0;
        System.out.println("Os múltiplos de 7 menores que 200 são: ");

        while(multiplo <= 200){

            multiplo = i * 7; 
            if(multiplo <= 200){
                System.out.println(multiplo);
            }
            i++;
        }


        entrada.close();
    }
}
