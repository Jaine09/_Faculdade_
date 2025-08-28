/*Escreva um algoritmo que permita a leitura dos nomes de 3
pessoas e armazene os nomes lidos em um vetor. Após isto, o
algoritmo deve solicitar a leitura de mais 1 nome qualquer de
pessoa e depois escrever a mensagem ACHEI, se o nome estiver
entre os nomes lidos anteriormente (guardados no vetor), ou NÃO
ACHEI caso contrário.
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[3];
        System.out.println("Escreva três nomes:");

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = entrada.nextLine();
        }

        System.out.println("Digite um nome para verificar se entrou no vetor");
        String nome = entrada.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nome.equals(nomes[i])) {
                System.out.println("Achei");
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("Não achei");
        }
    }
}
