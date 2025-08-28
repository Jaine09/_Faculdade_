import java.util.Scanner;

/* Fazer um algoritmo que leia os dois lados A e B de um triângulo retângulo e calcula a hipotenusa do triângulo. 
Para esse caso, considere que ℎ𝑖𝑝𝑜𝑡𝑒𝑛𝑢𝑠𝑎 = √𝐴 2+𝐵 2 . Dica: nesse programa, você deve usar a 
função matemática Math.sqrt(). Por exemplo, a raiz de 121 ficaria Math.sqrt(121).  */

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor dos dois lados do seu triângulo retângulo para saber o valor da hipotenusa");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.err.print("O valor da hipotenusa do trângulo retângulo com lado " + a + " e " + b + " é: " + hipotenusa);

        entrada.close();
    }
}
