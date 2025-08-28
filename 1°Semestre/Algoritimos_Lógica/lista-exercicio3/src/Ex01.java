/*Fazer uma função que tem como parâmetro de entrada três números inteiros a, b, c e devolve (retorna)
menor dentre os três números. */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite três números para retornar o menor:");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        int num3 = entrada.nextInt();

       System.out.println("O menor número digitado foi: " + menor(num1, num2, num3)); 
        
    }

    public static int menor(int a, int b, int c){
        int menor = 0;

        if(a < b && a < c){
            menor = a;
        }else if (b < a && b < c){
            menor = b;
        }else{
            menor = c;
        }

        return menor;

    }
}
