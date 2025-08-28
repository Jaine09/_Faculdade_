package aula3;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Número");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("Numero: "+num);
            case 2:
                System.out.println("Numero: "+num);
            case 3: 
                System.out.println("Numero: "+num);
            case 4:
                System.out.println("Numero: "+num);
            case 5: 
                System.out.println("Numero: "+num);
            
        }
        
        input.close();
    }
}
