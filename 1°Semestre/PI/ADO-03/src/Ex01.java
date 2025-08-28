import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o valor da compra: ");
    double valorCompra = entrada.nextDouble();

    if(valorCompra >= 300.00){
      double desconto = valorCompra*0.2;
      double valorFinal = valorCompra - desconto;

      System.out.print("O valor de desconto foi de "+ desconto + " e o valor final da compra         foi de "+ valorFinal);
    }else{
      double desconto = valorCompra*0.15;
      double valorFinal = valorCompra - desconto;

      System.out.print("O valor de desconto foi de "+ desconto + " e o valor final da compra         foi de "+ valorFinal);
    }
 
    entrada.close();
  }

}
