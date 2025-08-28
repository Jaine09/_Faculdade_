package aula3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int n1 = entrada.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = entrada.nextInt();

        System.out.println("Escolha a operação que deseja fazer: \n 1:Média entre os números digitados \n 2:Diferença entre os números \n 3:Produtos entre os números digitados \n 4:Divisão do primeiro pelo segundo");
        int operacao = entrada.nextInt();

        switch (operacao) {
            case 1:
                int media = (n1+n2)/2;
                System.out.println("A média é: " + media);
                break;
            case 2:
                int diferenca = n1-n2;
                System.out.println("A diferença é de: " + diferenca);
                break;
            case 3:
                int produto = n1 * n2;
                System.out.println("O produto é: " + produto);
                break;
            case 4:
                int divisao = n1/n2;
                System.out.println("A divisão é: " + divisao);
                break;
            default:
                System.out.println("ERRO");
                break;
        }
        entrada.close();
    }
}
