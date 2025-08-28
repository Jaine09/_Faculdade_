/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

import java.util.Scanner;

/**
 *
 * @author fernando.lalmeida
 */
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Nota 1: ");
        float n1 = input.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = input.nextFloat();
        System.out.println("Nota 3: ");
        float n3 = input.nextFloat();
        float media = (n1+n2+n3)/3;
        System.out.println("MÃ©dia: " + media);
        if(media >= 6){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
        input.close();
    }
}
