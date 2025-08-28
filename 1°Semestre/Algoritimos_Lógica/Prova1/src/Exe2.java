// Jaíne 
// Camile
import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número");
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        int contadorMaior = 0;
        int contadorMenor = 0;

        do{
            int i = 1;
            System.out.println("Digite o " + i + "° número");
            n = entrada.nextInt();


            if(contadorMaior < n){
                contadorMaior = n;
            }else if(contadorMenor > n ){
              
                if(n >= 0){
                    contadorMenor = n;
                }
            }

            i++;

        }while (n >= 0);

            
        
        }
        System.out.println("O maior número digitado foi " + contadorMaior);
        System.out.println("O menor numero digitado foi " + contadorMenor);
}
}