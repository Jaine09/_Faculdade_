import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
       int tentativa = 1;

       do {
            System.out.println("Qual é a principal função de uma chave primária em uma tabela?");
            System.out.println(" a) Estabelecer um relacionamento com outra tabela.\n b) Identificar de forma única cada registro em uma tabela.\n c) Ordenar os registros em uma tabela.\n d) Calcular valores automaticamente.\n e) Garantir que todos os campos de uma tabela sejam preenchidos.");

            char alternativa = entrada.next().charAt(0);
            switch (alternativa) {
                case 'a':
                case 'A':
                    System.out.println("Resposta incorreta");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Resposta correta. Você acertou a questão na " + tentativa + " tentativa.");
                    return;
                case 'c':
                case 'C':
                    System.out.println("Resposta incorreta");
                    break;
                case 'd':
                case 'D':
                    System.out.println("Resposta incorreta");
                    break;
                case 'e':
                case 'E':
                    System.out.println("Resposta incorreta");
                    break;
                default:
                    System.out.println("Alternativa Inválida");
                    break;
            }
            tentativa++;
       } while (tentativa <= 3);

        System.out.println("Resposta incorreta 3 vezes.");

        entrada.close();
    }
}
