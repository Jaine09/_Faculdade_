import java.util.Scanner;
public class Ex_fibonacci {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = entrada.nextInt();
        System.out.println("Fibonacci de " + num + " é " + fibonacci(num));
    }

    public static int fibonacci(int i){
        if(i == 0 || i==1){
            return i;
        } else{
            return fibonacci(i-1) + fibonacci(i-2);
        }
    }
}
