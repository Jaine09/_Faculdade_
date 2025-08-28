import java.util.Scanner;

/* Escreva um programa que leia o número de cadastro de um funcionário, seu número de horas trabalhadas, 
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número e o 
salário do funcionário. */

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de cadastro do funcionário: ");
        int numCadastro = entrada.nextInt();
        
        System.out.print("Número de horas trabalhadas: ");
        int hrsTrabalhada = entrada.nextInt();

        System.out.print("Valor por hora: ");
        double valorHr = entrada.nextDouble();

        double salario = (valorHr*hrsTrabalhada)*20;

        System.out.println("O funcionário " + numCadastro + " recebeu no final do mês R$" + salario);


        entrada.close();
    }
}
