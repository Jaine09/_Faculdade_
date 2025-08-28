import java.util.Scanner;

/* Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C 
com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a 
mensagem "Valores aceitos", senão escrever "Valores não aceitos".  */

public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quatro números: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();

        int somaAB = a+b;
        int somaCD = c+d;

        if(b > c && d > a && somaCD > somaAB && c > 0 && d > 0 && a%2 == 0 ){
            System.out.print("Valores aceitos");
        }else{
            System.out.print("Valores não aceitos");
        }

        entrada.close();
    }
}
