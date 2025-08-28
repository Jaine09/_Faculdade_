/*Desenvolver um programa que leia 10
números inteiros digitados pelo usuário.
Se o número informado for par, o valor
deve ser multiplicado por 10 e
armazenado no vetor. Se for ímpar deve
ser somado com 5 e armazenado no
vetor. Ao final mostrar o conteúdo do
vetor. */

import java.util.Scanner;


public class Ex04{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 10 númeos inteiros: ");
        int [] num = new int [10];

        for(int i = 0; i < num.length; i++){
            num[i] = entrada.nextInt();
            if(num[i]%2 == 0){
               num[i] = num[i]*10;
            }else{
                num[i] = num[i]+5;
            }
        }

        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
        
        
    }
}