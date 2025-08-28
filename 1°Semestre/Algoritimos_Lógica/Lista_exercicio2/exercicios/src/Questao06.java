/*Faça um programa para ler e escrever dados de uma turma de 5 alunos. O programa deve pedir dados como
nome, idade e sexo. O programa deve imprimir os dados do aluno mais velho. Use o laço DO-WHILE */

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        String sexo;

        int idadeMaisVelho = 0;
        String nomeMaisVelho = "";
        String sexoMaisVelho = "";
        int numAlunos = 5;

        int i = 1;

        do {
            System.out.println("Digite os dados dos alunos:");
            System.out.print("Nome: ");
            nome = entrada.next();

            System.out.print("Idade: ");
            idade = entrada.nextInt();

            System.out.print("Sexo: ");
            sexo = entrada.next();

            if(idade >= idadeMaisVelho){
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
                sexoMaisVelho = sexo;

            }
            i++;
        } while (i <= numAlunos);

        System.out.println("O aluno mais velho é: "+ nomeMaisVelho + "que tem " + idadeMaisVelho + "anos e é do sexo  "+ sexoMaisVelho);


        entrada.close();
        
    }
}
