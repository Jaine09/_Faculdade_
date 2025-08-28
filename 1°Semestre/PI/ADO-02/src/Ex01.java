import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o primeiro número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite o primeiro número: ");
        double num3 = entrada.nextDouble();

        double produto = num1 * num2 * num3;

        System.out.println("O produto dos número é: " + produto);

        entrada.close();
    }
}
