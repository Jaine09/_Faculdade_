package aula1;

import java.util.Scanner;

/**
 *
 * @author fernando.lalmeida
 * 
 * Escreva um programa em Java que leia o nome de um aluno e trÃªs notas.
 * Calcule a mÃ©dia ponderada das 3 notas considerando os seguintes pesos:
 * 2(n1), 3(n2) e 5(n3). Ao final, o programa deve imprimir o nome do aluno
 * e a sua respectiva mÃ©dia.
 */



public class Exemplo4 {
    //psvm + tab
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float p1 = 0.2f;
        float p2 = 0.3f;
        float p3 = 0.5f;
        
        System.out.println("Nome: ");
        String nome = input.next();
        
        //sout + tab
        System.out.println("Nota 1: ");
        float n1 = input.nextFloat();    //entrada de dados
        System.out.println("Nota 2: ");
        float n2 = input.nextFloat(); //entrada de dados
        System.out.println("Nota 3: ");
        float n3 = input.nextFloat(); //entrada de dados
        
        float media = (n1*p1) + (n2*p2) +(n3*p3)/(p1+p2+p3); //processamento
        
        System.out.println(nome + ", sua mÃ©dia Ã©: " + media); //saÃ­da de dados
        input.close();
    }
    
}