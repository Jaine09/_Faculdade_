/*Modificar o programa anterior para que
informe quantos alunos foram aprovados
e reprovados, ao final liste todas as
notas, a quantidade de aprovados e
reprovados, sendo que a média é 7. */

import java.util.Scanner;

public class Ex03 {
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
        int aprovado = 0;
        int reprovado = 0;

        System.out.println("Notas inseridas entre 7 e 9:");
        for(int i = 0; i < notas.length; i++){
            if(notas[i] >= 7 ){
                //System.out.println(notas[i]);
                aprovado++;
            }else{
                reprovado++;
            }
        }

        System.out.println("Quantidade de alunos aprovados: " + aprovado);
        System.out.println("Quantidade de alunos reprovados: " + reprovado);
    }
}
