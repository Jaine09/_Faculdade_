import java.util.Scanner;

// Fazer um algoritmo que leia três números e imprime o maior deles. 

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite três números");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();
        double n3 = entrada.nextDouble();

        if(n1 > n2 && n1 > n3){
            System.out.print(n1 + " foi o maior número digitado");
        } else if (n2 > n1 && n2 > n3){
            System.out.print(n2 + " foi o maior número digitado");
        } else if (n3 > n1 && n3 > n2){
            System.out.print(n3 + " foi o maior número digitado");
        } else {
            System.out.print("Os números digitados são iguais");
        }

        entrada.close();
    }
}
