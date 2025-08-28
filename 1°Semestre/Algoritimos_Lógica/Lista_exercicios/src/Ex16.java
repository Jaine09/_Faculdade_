import java.util.Scanner;

/* 
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. 
*/

public class Ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Hora inicial do jogo (0-23): ");
        int hrInicial = entrada.nextInt();
        System.out.print("Hora final do jogo (0-23): ");
        int hrFinal = entrada.nextInt();

        if (hrInicial < 0 || hrInicial > 23 || hrFinal < 0 || hrFinal > 23) {
            System.out.print("Por favor digite somente valores válidos 0-23: ");
        }

        int tempoTotal;

        if(hrFinal > hrInicial){
            tempoTotal = hrFinal - hrInicial;
        }else if (hrInicial == hrFinal){
            tempoTotal = 24;
        }else{
            tempoTotal = 24-(hrInicial - hrFinal) ;
        }

        System.out.println("A partida durou " + tempoTotal + " horas.");

        entrada.close();
    }
}
