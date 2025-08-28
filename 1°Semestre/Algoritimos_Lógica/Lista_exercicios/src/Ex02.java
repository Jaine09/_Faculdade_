import java.util.Scanner;

/* Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao 
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria 
Math.pow(5, 3). Você pode trocar esses números por variáveis. */

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ser a base: ");
        int base = entrada.nextInt();
        System.out.print("Digite um número para ser o expoente: ");
        int expoente = entrada.nextInt();

        double resultado = Math.pow(base, expoente);

        System.out.print("O número " + base + " elevado a " + expoente + " = " + resultado);

        entrada.close();
    }
}
