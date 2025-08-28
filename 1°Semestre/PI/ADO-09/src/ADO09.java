import java.util.Random;
import java.util.Scanner;

public class ADO09 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o valor minímo de intervalo: ");
        int min = entrada.nextInt();
        System.out.print("Digite o valor máximo de intervalo: ");
        int max = entrada.nextInt();

        int a = random.nextInt(max - min + 1) + min;
        int b = random.nextInt(max - min + 1) + min;

        if (a == 0) {
            if (b == 0) {
                System.out.println("A equação possui infinitas soluções.");
            } else {
                System.out.println("A equação não possui solução.");
            }
        } else {
           
            double x = -b / a;
            System.out.println(" ax + b = 0 ");
            System.out.println("Solução: x = " + x);
        }


        entrada.close();
    }
}
