import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu primeiro nome: ");

        String nome = entrada.nextLine();

        int caracteres = nome.length();

        System.out.print("O nome "+ nome + " tem " + caracteres + " caracteres");
        entrada.close();
    }
}
