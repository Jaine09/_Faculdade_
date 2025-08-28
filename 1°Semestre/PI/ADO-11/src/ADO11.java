import java.util.Scanner;

public class ADO11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Caminho minado");
        System.out.print("Informe o tamanho do caminho: ");

        int caminho = entrada.nextInt();

        System.out.print("Informe a quantidade de bombas: ");
        int bombas = entrada.nextInt();

        entrada.close();
    }
}
