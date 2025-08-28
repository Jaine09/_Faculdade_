import java.util.Scanner;

/* Fazer um algoritmo que leia dois números e imprima na tela o produto (multiplicação) dos dois números. */

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor para realizar o cálculo: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo valor para realizar o cálculo: ");
        int n2 = entrada.nextInt();

        int produto = n1*n2;

        System.out.print("O produto do cálculo " + n1 + " X " + n2 + " é: " + produto);

        entrada.close();

    }
}
