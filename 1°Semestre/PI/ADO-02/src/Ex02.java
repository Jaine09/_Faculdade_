import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para descobrir os três primeiros multiplos: ");

        int n = entrada.nextInt();

        int resultado1 = n*1;
        int resultado2 = n*2;
        int resultado3 = n*3;

        System.out.print("Os três primeiros multiplos de 5" + n + " são: " + resultado1 + "," + resultado2 + ",7" + resultado3);
        entrada.close();
    }
}
