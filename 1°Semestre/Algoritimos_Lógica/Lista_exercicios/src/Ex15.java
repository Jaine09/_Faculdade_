import java.util.Scanner;

/*Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara. 
−𝐵 ±√𝐵2−4∗𝐴∗𝐶  2 ∗𝐴
 Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de número negativo, mostre 
a mensagem correspondente “Impossível calcular”. */

public class Ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite os três números da sua equação do segundo grau");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double delta = b*b - 4*a*c;

        if(a == 0 || delta < 0){
            System.out.println("Impossível calcular");
        }else{
            double x1 =(-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);

            System.out.println("O valor de x1 é: " + x1);
            System.out.println("O valor de x2 é: " + x2);
        }
        entrada.close();
    }
}
