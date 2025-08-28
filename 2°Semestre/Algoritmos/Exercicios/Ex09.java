/*Escreva um algoritmo que permita a leitura das notas de uma
turma. Calcular a média da turma e contar quantos alunos
obtiveram nota acima desta média calculada. Mostre a média da
turma e o resultado da contagem.
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantidade de alunos:");
        int qtdAluno = entrada.nextInt();

        float[] notas = new float[qtdAluno];
        float soma = 0;
        float media;
        int acimaMedia = 0;

        for(int i = 0; i < notas.length; i++){
            System.out.println("Digite a nota do " + (i+1) + "° aluno");
            notas[i] = entrada.nextFloat();

            soma += notas[i];
        }

        media = soma/qtdAluno;

        for(int i = 0; i < notas.length; i++){
            if(notas[i] >= media){
                acimaMedia++;
            }
        }

        System.out.println("A média da turma foi " + media + ", e a quantidade de aluno acima da média foi "+ acimaMedia);
    }
}
