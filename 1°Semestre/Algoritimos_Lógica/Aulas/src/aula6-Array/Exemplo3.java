package aula6;
import java.util.Scanner;


public class Exemplo3 {
    public static void main(String[] args) {
        int v = tamanhoVetor();
        int []valores = valoresVetor(v);
        soma(valores);
        maiorMenorSoma(valores);
        imprimir(valores);
        
        
    }

    public static int tamanhoVetor(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho: ");
        int tamanho = leitor.nextInt();

        return tamanho;
    }

    public static int[] valoresVetor(int tamanho){
        Scanner leitor = new Scanner(System.in);
        int [] v = new int[tamanho];

        for(int i=0; i < tamanho; i++){
            System.out.println("Digite um número");
            v[i] = leitor.nextInt();
        }

        return v;

    }

    public static int soma(int []v){
        int soma = 0;
        for(int i=0; i < v.length ; i++){
            soma = soma + v[i];
        }
        return soma;
    }
    

    public static int[] maiorMenorSoma(int[] v){
         
         int menor = v[0];
         int maior = v[0];

         for(int i=0; i< v.length; i++){

             if(v[i] < menor){
                 menor = v[i];
                
             }
             if(v[i] > maior){
                 maior = v[i];
                
             }
         }

         return v;

    }



    public static void imprimir(int[] v){
        int soma = soma(v);
        int[] maiorMenor = maiorMenorSoma(v);
        int menor = maiorMenor[0];
        int maior = maiorMenor[0];

        for(int i=0; i < v.length; i++){
            System.out.print("v[" + i + "]: " + v[i]);

            if(v[i] == menor){
                System.out.print("<-- menor \n");
            } else if (v[i] == maior){
                System.out.print("<-- maior \n");
            }else{
                System.out.println("");
            }
        }
        System.out.println("A soma é: " + soma);
    }
}
