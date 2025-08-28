package aula1;

import java.util.Scanner;

/**
 *
 * @author fernando.lalmeida
 */
public class Exemplo3 {
    
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("Digite o seu nome: "); //escreva
        String nome = entrada.next(); //leia
        
        System.out.println("OlÃ¡, " + nome); //concatenaÃ§Ã£o
        entrada.close();
    }
}
