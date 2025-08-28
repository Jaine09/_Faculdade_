import java.util.Scanner;

public class Ex_03_contRegressiva {
    public static void main(String[] args) {
        int num;
        System.out.print("Digite um número para ver a contagem regressiva: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        contagemRegressiva(num);
    }

    public static int contagemRegressiva(int num){
        while (num > 0) {
            System.out.println(num-- + "...");
        }
        return 0;
    }
}
