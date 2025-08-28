import java.util.InputMismatchException;
import java.util.Scanner;

public class Carro {
    private int anoModelo;
    private int anoFabricacao;
    private String marca;
    private String modelo;
    private String cor;

    // Construtor
    public Carro(int anoModelo, int anoFabricacao, String marca, String modelo, String cor) {
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    // Getters
    public int getAnoModelo() {
        return anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Ano Modelo: " + anoModelo +
               ", Ano Fabricação: " + anoFabricacao +
               ", Marca: " + marca +
               ", Modelo: " + modelo +
               ", Cor: " + cor;
    }

    // Método estático para obter dados do carro do usuário
    public static Carro obterDadosCarro(Scanner scanner) {
        int anoModelo = 0;
        int anoFabricacao = 0;
        String marca;
        String modelo;
        String cor;

        while (true) {
            try {
                System.out.print("Digite o Ano Modelo do carro: ");
                anoModelo = scanner.nextInt();
                if (anoModelo < 1886) { // Primeiro carro a gasolina foi em 1886
                    System.out.println("Ano inválido. Por favor, insira um ano a partir de 1886.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida para o ano. Por favor, digite um número inteiro.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }

        while (true) {
            try {
                System.out.print("Digite o Ano de Fabricação do carro: ");
                anoFabricacao = scanner.nextInt();
                if (anoFabricacao < 1886) {
                    System.out.println("Ano inválido. Por favor, insira um ano a partir de 1886.");
                    continue;
                }
                scanner.nextLine(); // Consumir a nova linha pendente após nextInt()
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida para o ano. Por favor, digite um número inteiro.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }

        System.out.print("Digite a Marca do carro: ");
        marca = scanner.nextLine();

        System.out.print("Digite o Modelo do carro: ");
        modelo = scanner.nextLine();

        System.out.print("Digite a Cor do carro: ");
        cor = scanner.nextLine();

        return new Carro(anoModelo, anoFabricacao, marca, modelo, cor);
    }
}