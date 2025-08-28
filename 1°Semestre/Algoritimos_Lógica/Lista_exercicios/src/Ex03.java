import java.util.Scanner;

/* Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado 
de um número A é representado por A2 = A * A. */

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número que deseja que seja elevado ao quadrado: ");
        int n1 = entrada.nextInt();
        int quadrado1 = n1*n1;
        System.out.print("Digite o segundo número que deseja que seja elevado ao quadrado: ");
        int n2 = entrada.nextInt();
        int quadrado2 = n2*n2;

        int somaQuadrados = quadrado1 + quadrado2;

        System.out.print("A soma dos " + quadrado1 + " + " + quadrado2 + " = " + somaQuadrados);

        entrada.close();
    }
}
