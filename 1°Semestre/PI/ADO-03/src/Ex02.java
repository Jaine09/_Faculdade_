import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);

   System.out.print("digite o valor da lateral do seu triângulo: ");
    int ladoA = entrada.nextInt();

    System.out.print("digite o valor da outra lateral do seu triângulo: ");
    int ladoB = entrada.nextInt();

    System.out.print("digite o valor da base do seu triângulo: ");
    int base = entrada.nextInt();

    if(ladoA == ladoB && ladoB == base){
      System.out.println("Você criou um triângulo equilátero");
    } else if(ladoA == ladoB || ladoB == base || ladoA == base){
      System.out.println("Você criou um triângulo isósceles");
    }else{
      System.out.println("Você criou um triângulo escaleno");
    }
   
    entrada.close();
  }
}
