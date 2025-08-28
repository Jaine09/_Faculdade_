import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
            ArrayList<String> alternativa = new ArrayList<>();

            alternativa.add(" Estabelecer um relacionamento com outra tabela.");
            alternativa.add(" Identificar de forma única cada registro em uma tabela.");
            alternativa.add(" Ordenar os registros em uma tabela.");
            alternativa.add(" Calcular valores automaticamente.");
            alternativa.add(" Garantir que todos os campos de uma tabela sejam preenchidos.");

            String alternativaCorreta = "b";
            boolean certo = false;

            int tentativa = 1;

            do{
                System.out.println("Qual é a principal função de uma chave primária em uma tabela?");
                for (int i = 0; i < alternativa.size(); i++) {
                    System.out.printf("%c) %s%n", 'a' + i, alternativa.get(i));
                }
                System.out.println("Digite sua resposta: ");
                String respostaUsuario = entrada.nextLine();


                if (respostaUsuario.equals(alternativaCorreta)) {
                    System.out.println("Resposta correta!");
                    certo = true;
                } else {
                    System.out.print("Resposta incorreta. Tente novamente\n");
                    tentativa++;
                    Collections.shuffle(alternativa);
                }
                
            }while(!certo && tentativa <= 3);

        entrada.close();
    }
    
    
}

