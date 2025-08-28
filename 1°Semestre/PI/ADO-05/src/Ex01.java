import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        
        boolean acao = false;

        do{
            System.out.println("Digite o número da ação desejada: ");
            System.out.println(" 1-Instruções \n 2-Jogar \n 3-Créditos \n 4-Sair\n");
            int escolherAcao = entrada.nextInt();

            switch (escolherAcao) {
                case 1:
                    System.out.println("O jogo está em desenvolvimento");
                    acao = true;
                    break;
                case 2:
                    System.out.println("Jogo iniciado");
                    acao = true;
                    break;
                case 3:
                    System.out.println("Criado por: Jaíne Jesus Costa");
                    acao = true;
                    break;
                case 4:
                    System.out.println("Saindo");
                    acao = true;
                    break;
                default:
                    System.out.println("O valor inserido não é válido! \n");
                    break;
            }

        }while (acao == false);


        entrada.close();
    }
}
