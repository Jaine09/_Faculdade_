import java.util.Scanner;

/* Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números. (Por 
exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2. –8 é consecutivo 
de –9) */

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número para visualizar o seu consecutivo: ");

        int n1 = entrada.nextInt();
        int consecutivo1 = n1 + 1;

        System.out.print("Digite o segundo número para visualizar o seu consecutivo: ");
        int n2 = entrada.nextInt();
        int consecutivo2 = n2 + 1;

        System.out.println("\nO consecutivo de " + n1 + " é " + consecutivo1);
        System.out.println("O consecutivo de " + n2 + " é " + consecutivo2);

        entrada.close();
    }
}
