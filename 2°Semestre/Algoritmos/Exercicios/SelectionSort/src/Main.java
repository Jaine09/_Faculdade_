import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Método para ordenar a lista de carros usando Selection Sort
    public static void selectionSortCarros(List<Carro> listaCarros) {
        int n = listaCarros.size();
        for (int i = 0; i < n - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < n; j++) {
                if (listaCarros.get(j).getAnoFabricacao() < listaCarros.get(idxMin).getAnoFabricacao()) {
                    idxMin = j;
                }
            }
            // Troca os elementos
            Carro temp = listaCarros.get(i);
            listaCarros.set(i, listaCarros.get(idxMin));
            listaCarros.set(idxMin, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();
        int numCarros = 0;

        while (true) {
            try {
                System.out.print("Quantos carros você deseja cadastrar? ");
                numCarros = scanner.nextInt();
                if (numCarros <= 0) {
                    System.out.println("Por favor, insira um número positivo de carros.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpar o buffer do scanner
            }
        }
        scanner.nextLine(); // Consumir a nova linha pendente após nextInt()

        for (int i = 0; i < numCarros; i++) {
            System.out.println("\n--- Dados do Carro " + (i + 1) + " ---");
            Carro carro = Carro.obterDadosCarro(scanner);
            carros.add(carro);
        }

        System.out.println("\n--- Carros antes da ordenação ---");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        // Ordena os carros pelo ano de fabricação
        selectionSortCarros(carros);

        System.out.println("\n--- Carros depois da ordenação por Ano de Fabricação (Selection Sort) ---");
        for (Carro carro : carros) {
            System.out.println(carro);
        }

        scanner.close();
    }
}