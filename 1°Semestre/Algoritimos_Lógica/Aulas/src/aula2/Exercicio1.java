/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author fernando.lalmeida
 * 
 * Escreva um programa em Java que leia o nome de um aluno,
 * as 3 notas e o nÃºmero de faltas. O programa deve calcular
 * a mÃ©dia do aluno, e imprimir as seguintes mensagens:
 * - Se a mÃ©dia for maior ou igual a 6 e o nÃºmero da faltas for
 * menor ou igual a 18, o programa deve imprimir "Aprovado!"
 * - Se a mÃ©dia for maior ou igual a 6 e o nÃºmero da faltas for
 * maior do que 18, o programa deve imprimir "Reprovado por falta!"
 * - Se a mÃ©dia for menor 6 e o nÃºmero de faltas for menor ou igual 
 * a 18, imprimir "RecuperaÃ§Ã£o" - solicitar uma nova nota e o calculo
 * de uma nova mÃ©dia. Se a mÃ©dia for maior ou igual a 6, imprimir
 * "Aprovado".
 * - Caso contrÃ¡rio, imprimir "Reprovado"
 * 
 * 
 * 
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nome: ");
        // String nome = input.next();
        
        System.out.println("Faltas: ");
        byte faltas = input.nextByte();
        
        System.out.println("Nota 1: ");
        float n1 = input.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = input.nextFloat();
        System.out.println("Nota 3: ");
        float n3 = input.nextFloat();
        float media = (n1+n2+n3)/3;
        System.out.println("MÃ©dia: " + media);
        
        if(media >= 6 && faltas <= 18){
            System.out.println("Aprovado!");
        }else if(faltas > 18){
            System.out.println("Reprovado por FALTA!");
        }else{
            System.out.println("*** Recuperação ***");
            System.out.println("REA: ");
            float rec = input.nextFloat();
            float novaMedia = (media + rec)/2;
            if(novaMedia >= 6){
                System.out.println("Aprovado REA");
            }else{
                System.out.println("Reprovado!");
            }
        }
        input.close();
    }
}
