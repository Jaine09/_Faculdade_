import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Responda a questão:\n De acordo com a matéria Conceitos de Computação, o que significa Tecnologia?");
        System.out.println("\n a) Tudo que tem conexão com a internet \n b)Aplicação de qualquer método ou instrumento \n c)Conjunto de pricípios, métodos, instrumentos e processos cientificamente determinados \n d)Conjunto de componentes interrelacionais que coleta, manipula, armazena e dissemina dados e informações.\n");

        char resposta = entrada.next().charAt(0);

        switch (resposta) {
            case 'a':
            case 'A':
                System.out.print("Resposta incorreta!");
                break;
            case 'b':
            case 'B':
                System.out.print("Resposta incorreta!");
                break;
            case 'c':
            case 'C':
                System.out.print("Parabéns! Resposta correta");
                break;
            case 'd':
            case 'D':
                System.out.print("Resposta incorreta!");
                break;
            default:
                System.out.print("A resposta inserida não é válida");
                break;
        }
        entrada.close();
    }
}
