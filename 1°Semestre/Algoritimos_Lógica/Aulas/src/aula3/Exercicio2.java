package aula3;

import java.util.Scanner;

public class Exercicio2 { 
    public static void main(String[] args) {
       Scanner notas = new Scanner(System.in);

       System.out.println("Digite a Nota 1:");
       int n1 = notas.nextInt();
       System.out.println("Digite a Nota 2:");
       int n2 = notas.nextInt();
       double media = (n1+n2)/2;

       char situacao;
       if (media <= 4.0) {
        situacao = 'R';
       } else if(media <= 7.0){
        situacao = 'E';
       } else if (media <= 10){
        situacao = 'A';
       } else {
        situacao = ' ';
       }

       switch (situacao) {
        case 'R':
            System.out.println("Média: " + media + "\n Situação: Reprovado");
            break;
        case 'E':
            System.out.println("Média: " + media + "\n Situação: Exame");
            break;
        case 'A':
            System.out.println("Média: " + media + "\n Situação: Aprovado");
            break;
        default:
            System.out.println("Resultado Inválido");
            break;
       }
        notas.close();
    }
}
    
