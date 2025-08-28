// Jaíne 
// Camile 

import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double preco = 0;
        char continuar;
        do{
            System.out.print("Qual o tipo de gasolina: ");
            int tipo = entrada.nextInt();

            System.out.print("Qual a quantidade em litro: ");
            int litro = entrada.nextInt();

            if(litro<=0 || tipo <= 0 || tipo > 2){
                System.out.println("Impossível realizar a operação");
                break;
            }

            double porcentagem;

             if(tipo == 1){
                if(litro <= 10){
                    preco = 5.79 * litro;
                    porcentagem = preco * 0.05;
                    System.out.println("O total com desconto de 5% é: " + (preco-porcentagem));
                } else if(litro > 10){
                    preco = 5.79 * litro;
                    porcentagem = preco * 0.07;
                    System.out.println("O total com desconto de 7% é: " + (preco-porcentagem));
                }
             }else{
                if(litro <= 5){
                    preco = 3.65 * litro;
                    System.out.println("Preço total a pagar: " + preco);
                }else{
                    preco = 3.65 * litro;
                    porcentagem = preco * 0.10;
                    System.out.println("O total com desconto de 10% é " + (preco-porcentagem));
                }
             }



             System.out.println("Realizar novo reabastecimento? S/N");
            continuar = entrada.next().charAt(0);
        }while(continuar == 'S' || continuar == 's');

        entrada.close();
    }
}
