import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Digite um número de 1 a 7 para descobrir o dia da semana correspondente");
        int diaSemana = entrada.nextInt();
            
        switch (diaSemana) {
            case 1:
                System.out.print("O dia correspondente ao número 1 é Domingo");
                break;
            case 2: 
                System.out.print("O dia correspondente ao número 2 é Segunda-feira");
                break;
            case 3:
                System.out.print("O dia correspondente ao número 3 é Terça-feira");
                break;
            case 4:
                System.out.print("O dia correspondente ao número 4 é Quarta-feira");
                break;
            case 5:
                System.out.print("O dia correspondente ao número 5 é Quinta-feira");
                break;
            case 6:
                System.out.print("O dia correspondente ao número 6 é Sexta-feira");
                break;
            case 7:
                System.out.print("O dia correspondente ao número 7 é Sábado");
                break;
            default:
                System.out.print("O número digitado não corresponde a nenhum dia da semana");
                break;
            }
    
        entrada.close();
    }
}
