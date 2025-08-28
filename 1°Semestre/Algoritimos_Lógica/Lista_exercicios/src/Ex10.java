import java.util.Scanner;

/* Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele 
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
calcular e imprimir o total a receber no final do mês. */

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do vendedor(a): ");
        String nomeVend = entrada.nextLine();

        System.out.print("Salário fixo: ");
        double salarioFixo = entrada.nextDouble();

        System.out.print("Total de vendas: ");
        double vendas = entrada.nextInt();

        double comissao = vendas*0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("O vendedor(a) " + nomeVend + " irá receber no final do mês " + salarioFinal);

        entrada.close();
    }
}
