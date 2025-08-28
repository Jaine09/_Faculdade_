import java.util.Scanner;

/* Fazer um algoritmo que leia dois números e imprime a divisão do maior pelo menor. */

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite dois números");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        if(num1 > num2){
            double divisao = num1/num2;
            System.out.println(num1 + "/" + num2 + " = " + divisao);
        }else if(num2 > num1){
            double divisao = num2/num1;
            System.out.println(num2 + "/" + num1 + " = " + divisao);
        }else{
            System.out.println("Os números digitados são iguais");
        }

        entrada.close();
    }
}
