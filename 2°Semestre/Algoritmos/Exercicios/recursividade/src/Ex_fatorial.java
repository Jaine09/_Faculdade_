import java.util.Scanner;

public class Ex_fatorial {
    public static void main(String[] args) throws Exception {
        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        valor = entrada.nextInt();
        System.out.println("Fatorial de " + valor + " é " + fatorial(valor));
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
