package aula3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o código do produto adquirido pelo cliente: ");
        int codProd = entrada.nextInt();
        System.out.print("Quantidade adquirida: ");
        int quantidade = entrada.nextInt();

        double valorTotal;

        switch (codProd) {
            case 100:
                valorTotal = 1.70*quantidade;
                System.out.println("O valor total a pagar é: " + valorTotal);
                break;
            case 101:
                valorTotal = 2.30*quantidade;
                System.out.println("O valor total a pagar é: " + valorTotal);
                break;
            case 102:
                valorTotal = 2.60*quantidade;
                System.out.println("O valor total a pagar é: " + valorTotal);
                break;
            case 103:
                valorTotal = 2.40*quantidade;
                System.out.println("O valor total a pagar é: " + valorTotal);
                break;
            case 104:
                valorTotal = 2.50*quantidade;
                System.out.println("O valor total a pagar é: " + valorTotal);
                break;
            case 105:
                valorTotal = 1.00*quantidade;
                System.out.println("O valor total a pagar é: " + valorTotal);
                break;
            default:
                System.out.println("ERRO");
                break;
        }

            entrada.close();
    }
}
