import java.util.Scanner;

/* Escreva um algoritmo que leia três números decimais: A, B e C. Em seguida, calcule e mostre:  
a) a área do triângulo retângulo que tem A por base e C por altura.  
b) a área do círculo de raio C. (π = 3.14159)  
c) a área do trapézio que tem A e B por bases e C por altura.  
d) a área do quadrado que tem lado B.  
e) a área do retângulo que tem lados A e B. 
f) o perímetro do retângulo que tem lados A e B.  */

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite três números decimais: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double areaTriangulo = (a*c)/2;
        System.out.println("A área do triângulo retângulo que tem "+ a +" por base e " + c + " por altura é: " + areaTriangulo);

        double areaCirculo = Math.PI * Math.pow(c, 2);
        System.out.println("A área do círculo de raio " + c + " é: " + areaCirculo); 

        double areaTrapezio = (a+b)*c/2;
        System.out.println("A área do trapézio que tem" + a + " e " + b + " por bases e " + c +" por altura é: " + areaTrapezio);

        double areaQuadrado = b*b;
        System.out.println("A área do quadrado que tem lado " + b + " é: " + areaQuadrado);

        double areaRetangulo = a*b;
        System.out.println("A área do retângulo que tem lados " + a + " e " + b + " é: " + areaRetangulo);

        double perimetroRetangulo = 2*(a+b);
        System.out.println("O perímetro do retângulo que tem lados " + a + " e " + b + " é: " + perimetroRetangulo);

        entrada.close();
    }
}
