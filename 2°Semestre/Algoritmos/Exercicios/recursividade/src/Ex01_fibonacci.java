import java.util.Scanner;

public class Ex01_fibonacci {
    public static void main(String[] args) {
        int qtd_num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        qtd_num = entrada.nextInt();
        System.out.println("Fibonacci de " + qtd_num + " é " + fibonacci(qtd_num));
    }

    public static int fibonacci(int i){
        int anterior = 0;
        int atual = 1;
        int proximo = 1;

        for(int j = 0; j < i; j++){
            System.out.println(proximo);
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
        }
        return proximo;
    }
}
