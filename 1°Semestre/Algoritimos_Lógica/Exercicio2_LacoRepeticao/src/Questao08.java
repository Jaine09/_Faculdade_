// 8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade. 

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
       
         int maiorIdade = 0;
        for(int i = 1; i <= 20; i++){
            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();
            
            if(idade >= 18 ){
                maiorIdade++;
            }
        }

        System.out.println("Das idades listadas " + maiorIdade + " são maiores de idades");
        
       
       entrada.close();
    }
}
