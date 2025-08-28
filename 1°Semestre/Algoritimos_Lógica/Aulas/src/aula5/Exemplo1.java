package aula5;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {
        System.out.println("***** MAIN ****");
        System.out.println("--------------------");

        int a = obterNumero();
        int b = obterNumero();
        int result = minimo(a,b);
        imprimir(result);

        int c = obterNumero();
        System.out.println("Soma de todos o número de 1 até " + c);
        int total = soma(c);
        imprimir(total);
    }

    public static int minimo(int n1, int n2) {
        //Encontrando o menor valor 
        int menor = 0;
        if(n1<n2){
            menor = n1;
        }else{
            menor = n2;
        }

        return menor;
    }

    public static int obterNumero(){
        //Entrada de dados
        Scanner input = new Scanner(System.in);

        System.out.print("Número: ");
        int n = input.nextInt();

        return n;
    }

    // Função sem retorno - imprimir mensagem não é retorno
    public static void imprimir(int n){
        //Imprimir resultado 
        System.out.println("Resultado " + n);
    }

    public static int soma(int n){
        int total = 0;

        for(int i = 1; i <= n; i++){
            total += i;
        }
    
        return total;
    }
}
