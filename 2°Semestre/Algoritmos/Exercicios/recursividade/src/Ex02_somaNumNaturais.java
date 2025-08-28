import java.util.Scanner;

public class Ex02_somaNumNaturais {
    public static void main(String[] args) {
        int num;
        System.out.print("Digite um número: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        System.out.println("A soma de todos os números naturais até " + num + " é: " + somaNaturais(num));
    }

    public static int somaNaturais(int num){
        int soma = 0;
        if(num == 0){
            return 0;
        }else{
            for (int i = 0; i <= num; i++){
            soma = soma + i;
         }
        }
        return soma;
    }
}
