/* Elaborar um programa que leia 10 notas
de alunos armazenando-as em um vetor
notas[ ], imprimir as notas de índice 7 e
9 no final.*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        float notas[] = receberNotas();
        retornarNotas(notas);
        
    }

    public static float[] receberNotas(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite 10 notas: ");
        float []nota = new float[10];

        for(int i = 0; i < nota.length; i++){
            nota[i] = entrada.nextFloat();
            // System.out.println(nota[i]);
        }

        return nota;
    }

    public static void retornarNotas(float notas[]){
        System.out.println("Notas inseridas entre 7 e 9:");
        for(int i = 0; i < notas.length; i++){
            if(notas[i] >= 7 ){
                System.out.println(notas[i]);
            }
        }
    }
}
