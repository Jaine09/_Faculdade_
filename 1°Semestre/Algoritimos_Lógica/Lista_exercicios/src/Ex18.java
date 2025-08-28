import java.util.Scanner;

/* Leia 3 números decimais A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o 
maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos 
seguintes casos, sempre escrevendo uma mensagem adequada: 
● se A ≥ B+C, apresente a mensagem: NAO FORMA TRIÂNGULO 
● se A2 = B2 + C2, apresente a mensagem: TRIÂNGULO RETÂNGULO 
● se A2 > B2 + C2, apresente a mensagem: TRIÂNGULO OBTUSÂNGULO 
● se A2 < B2 + C2, apresente a mensagem: TRIÂNGULO ACUTÂNGULO 
● se os três lados forem iguais, apresente a mensagem: TRIÂNGULO EQUILÁTERO 
● se apenas dois dos lados forem iguais, apresente a mensagem: TRIÂNGULO ISÓSCELES */

public class Ex18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite três valores para descobrir qual o seu trângulo: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double x;
        if(a<b) {
            x = a; 
            a = b; 
            b = x; 
        } if(a<c) {
            x = c;
            c = a;
            a = x;
        } if(b<c) {
            x = b;
            b = c;
            c = x;
        }

        if(a >= (b+c)){
            System.out.println("NÃO FORMA TRIÂNGULO");
        }else{
            double aQuadrado = Math.pow(a, 2);
            double bQuadrado = Math.pow(b, 2);
            double cQuadrado = Math.pow(c, 2);
            double somaBC = bQuadrado+cQuadrado;
            if (aQuadrado == somaBC) {
                System.out.println("TRIÂNGULO RETÂNGULO");
            }if(aQuadrado > somaBC){
                System.out.println("TRIÂNGULO OBTUSÂNGULO");
            }if (aQuadrado < somaBC){
                System.out.println("TRIÂNGULO ACUTÂNGULO");
            }if (a == b && b == c && c == a){
                System.out.println("TRIÂNGULO EQUILÁTERO");
            } if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
                System.out.println("TRIÂNGULO ISÓSCELES");
            }
        }
        
        entrada.close();
    }
}
