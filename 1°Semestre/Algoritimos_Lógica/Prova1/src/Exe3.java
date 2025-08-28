// Jaíne
// Camile
import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double aliquota;
        double valorLiquido;
        String resposta;

        do{
            System.out.println("Digite o salário");
            double salario = entrada.nextDouble();

            if(salario <= 1903.98){
                System.out.println("Isento");
            }else if(salario <= 2826.65){
                aliquota = salario * 0.075;
                valorLiquido = salario - aliquota;
                System.out.println("O valor bruto é R$" + salario + " o valor liquido é R$" + valorLiquido + " a aliquota paga foi de R$" + aliquota);
            }else if(salario <= 3751.05){
                aliquota = salario * 0.15;
                valorLiquido = salario - aliquota;
                System.out.println("O valor bruto é R$" + salario + " o valor liquido é R$" + valorLiquido + " a aliquota paga foi de R$" + aliquota);
            }else if(salario <= 4664.68){
                aliquota = salario * 0.225;
                valorLiquido = salario - aliquota;
                System.out.println("O valor bruto é R$" + salario + " o valor liquido é R$" + valorLiquido + " a aliquota paga foi de R$" + aliquota);
            }else{
                aliquota = salario * 0.275;
                valorLiquido = salario - aliquota;
                System.out.println("O valor bruto é R$" + salario + " o valor liquido é R$" + valorLiquido + " a aliquota paga foi de R$" + aliquota);
            }

            System.out.println("Você deseja reiniciar a consulta?");
            resposta = entrada.next().toUpperCase();

        }while(resposta.equals("SIM"));
    }
}
