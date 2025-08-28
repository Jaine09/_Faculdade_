/*Um jogo bem simples consiste em tentar adivinhar um valor inteiro aleatório
escolhido entre 1 e 100 por um computador. O usuário/jogador terá apenas 5
chances para tentar adivinhar o valor. A cada tentativa do jogador, caso ele não
acerte, o programa deve informar se o valor digitado é maior ou menor que o
valor escolhido pelo computador. E caso o valor digitado pelo jogador tenha
diferença em módulo igual a 1 com o valor correto deverá ser impresso “TÁ
QUENTE!” (por exemplo, o computador escolheu 42 e o jogador digitou 41
ou 43). No final, deverá ser impresso “Parabéns, você ganhou o jogo!”, se o
jogador conseguiu acertar o valor escolhido pelo computador, ou “Game
Over!”, caso contrário.
 */

import java.util.Random;
import java.util.Scanner;

public class Ado10 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativas = 5;
        int numeroCorreto = numeroSecreto;
        int chute = 1;

        System.out.println("Bem-vindo ao jogo de adivinhação");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
             System.out.print("Digite o número que você acha que é: ");
             int num  = entrada.nextInt();

            if ( chute == 5 && num != numeroCorreto){
                System.out.println("Game Over");
                break;
            }else if ( (numeroCorreto - num) == 1 || (num - numeroCorreto) == 1){
                System.out.println("TÁ QUENTE");
                chute++;
            } else if(num < numeroCorreto){
                System.out.println("O número digtado é MENOR que o número correto");
                chute++;
            } else if(num > numeroCorreto){
                System.out.println("O número digtado é MAIOR que o número correto");
                chute++;
            } else if (num == numeroCorreto) {
                System.out.println("Parabéns, você ganhou o jogo!");
                break;
            }
            
        } while (chute <= tentativas);
        
           


        entrada.close();
    }
}
