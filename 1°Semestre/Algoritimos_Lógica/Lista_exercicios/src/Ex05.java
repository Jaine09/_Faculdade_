import java.util.Scanner;

/* Fazer um algoritmo que leia um valor L e calcula a área de um quadrado de lado L. */

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da lateral do seu quadrado para descobrir a área dele: ");
        int lateral = entrada.nextInt();
        int area = lateral*lateral;

        System.out.println("A área do seu quadrado é: " + area);

        entrada.close();
    }
}
