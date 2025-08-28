import java.util.Scanner;

/* Fazer um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a 
mensagem "Numero negativo". */

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num = entrada.nextDouble();

        if(num < 0 ){
            System.out.print("Número negativo");
        }else{
            System.out.print("O valor digitado foi: "+ num);
        }
        entrada.close();
    }
}
