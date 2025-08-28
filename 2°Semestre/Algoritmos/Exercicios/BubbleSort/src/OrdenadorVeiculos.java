import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrdenadorVeiculos {

    // Enum para os critérios de ordenação
    public enum CriterioOrdenacao {
        PLACA,
        MODELO,
        FABRICANTE
    }

    public static void bubbleSort(List<Veiculo> veiculos, CriterioOrdenacao criterio) {
        int n = veiculos.size();
        boolean trocou;
        for (int i = 0; i < n - 1; i++) {
            trocou = false;
            for (int j = 0; j < n - 1 - i; j++) {
                // Compara os veículos com base no critério escolhido
                boolean deveTrocar = false;
                String valor1 = "";
                String valor2 = "";

                switch (criterio) {
                    case PLACA:
                        valor1 = veiculos.get(j).getPlaca();
                        valor2 = veiculos.get(j + 1).getPlaca();
                        break;
                    case MODELO:
                        valor1 = veiculos.get(j).getModelo();
                        valor2 = veiculos.get(j + 1).getModelo();
                        break;
                    case FABRICANTE:
                        valor1 = veiculos.get(j).getFabricante();
                        valor2 = veiculos.get(j + 1).getFabricante();
                        break;
                }

                if (valor1.compareTo(valor2) > 0) { // Compara strings alfabeticamente
                    deveTrocar = true;
                }

                if (deveTrocar) {
                    // Troca os elementos
                    Veiculo temp = veiculos.get(j);
                    veiculos.set(j, veiculos.get(j + 1));
                    veiculos.set(j + 1, temp);
                    trocou = true;
                }
            }
            // Se não houve trocas em uma passada, a lista já está ordenada
            if (!trocou) {
                break;
            }
        }
    }

    /**
     * Imprime a lista de veículos.
     * @param veiculos A lista de veículos a ser impressa.
     */
    public static void imprimirVeiculos(List<Veiculo> veiculos) {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo para exibir.");
            return;
        }
        for (Veiculo v : veiculos) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();
        int numVeiculos = 0;

        System.out.println("--- Ordenador de Veículos com Bubble Sort ---");

        // Permite que o usuário insira o número de veículos
        while (true) {
            try {
                System.out.print("Quantos veículos você deseja cadastrar? ");
                numVeiculos = Integer.parseInt(scanner.nextLine());
                if (numVeiculos <= 0) {
                    System.out.println("Por favor, insira um número positivo de veículos.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }

        // Coleta os dados de cada veículo
        System.out.println("\n--- Cadastro de Veículos ---");
        for (int i = 0; i < numVeiculos; i++) {
            System.out.println("\nVeículo " + (i + 1) + ":");
            System.out.print("Placa: ");
            String placa = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Fabricante: ");
            String fabricante = scanner.nextLine();
            veiculos.add(new Veiculo(placa, modelo, fabricante));
        }

        // Exibe os veículos antes da ordenação
        System.out.println("\n--- Veículos Antes da Ordenação ---");
        imprimirVeiculos(veiculos);

        // Solicita ao usuário o critério de ordenação
        CriterioOrdenacao criterio = null;
        while (criterio == null) {
            System.out.println("\nEscolha o critério de ordenação:");
            System.out.println("1 - Placa");
            System.out.println("2 - Modelo");
            System.out.println("3 - Fabricante");
            System.out.print("Digite o número da opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    criterio = CriterioOrdenacao.PLACA;
                    break;
                case "2":
                    criterio = CriterioOrdenacao.MODELO;
                    break;
                case "3":
                    criterio = CriterioOrdenacao.FABRICANTE;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
            }
        }

        // Ordena o vetor de veículos usando Bubble Sort
        bubbleSort(veiculos, criterio);

        // Exibe os veículos após a ordenação
        System.out.println("\n--- Veículos Após a Ordenação por " + criterio.name() + " ---");
        imprimirVeiculos(veiculos);

        scanner.close();
    }
}