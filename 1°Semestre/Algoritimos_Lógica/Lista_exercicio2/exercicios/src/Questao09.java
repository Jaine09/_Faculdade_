/*Escreva um programa para ler a quantidade de alunos existentes em uma turma. Depois disso, o programa
deve ler as notas de cada um destes alunos, calcular e mostrar na tela a média aritmética destas notas.
Utilize o laço WHILE. */

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de alunos: ");
        int qtdAluno = entrada.nextInt();

        int soma = 0;
        int i = 1;
        int notaAnterior = 0;
        int media;

        while (i <= qtdAluno) {
            System.out.println("Nota do " + i + "° aluno");
            int nota = entrada.nextInt();

            notaAnterior = nota;
            soma = notaAnterior + soma;
            i++;
        }

        media = soma/qtdAluno;
        System.out.println("A média aritmética da turma é: " + media);

        entrada.close();
    }
}
