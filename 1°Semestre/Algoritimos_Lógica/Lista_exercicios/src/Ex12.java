import java.util.Scanner;

/* Fazer um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado 
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Círculo".  */

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.err.println("Digite dois número, sendo o primeiro para ser calculado a área de um quadrado e o segundo o raio de um círculo");
        double l = entrada.nextDouble();
        double r = entrada.nextDouble();

        double areaQuadrado = l*l;
        double raio = Math.PI * Math.pow(r, 2);

        if(areaQuadrado > raio){
            System.out.println("O maior é o Quadrado");
        } else if (raio > areaQuadrado){
            System.out.println("O maior é o Círculo");
        }else{
            System.out.println("Os dois possuem o mesmo valor");
        }

        entrada.close();
    }
}
