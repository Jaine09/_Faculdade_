/*Faça um programa que calcule e imprima o resultado da soma abaixo (lembre-se de que tanto as divisões
quanto o resultado devem ser decimais). Utilize o laço que lhe for mais conveniente. */

public class Questao10 {
    public static void main(String[] args) {
        
        int n = 20; 
        double soma = 0;

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }

        System.out.println("A soma da série é: " + soma);
    }
}
