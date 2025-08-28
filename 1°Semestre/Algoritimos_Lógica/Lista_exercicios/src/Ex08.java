import java.util.Scanner;

/* Fazer um algoritmo que leia quatro números e imprime a média aritmética dos quatro números. */

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quatro números para descobrir a média aritmética deles");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();
        double n4 = entrada.nextDouble();

        double mediaArit = (n1+n2+n3+n4)/4;
        System.out.println("A média aritmética os números " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + " é: " + mediaArit);

        entrada.close();
    }
}
