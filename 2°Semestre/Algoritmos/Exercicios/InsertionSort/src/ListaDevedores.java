import java.util.ArrayList;
import java.util.List;

public class ListaDevedores {

    public static void selectionSortDevedores(List<Devedor> listaDevedores) {
        int n = listaDevedores.size();

        System.out.println("--- Início do Selection Sort ---");
        System.out.println("Lista inicial:");
        imprimirLista(listaDevedores);
        System.out.println("\n" + "=".repeat(50) + "\n");

        for (int i = 0; i < n - 1; i++) {
            // Encontra o índice do menor elemento restante na sublista não ordenada
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                // Compara os valores devidos para encontrar o menor (ordem crescente)
                if (listaDevedores.get(j).getValorDevido() < listaDevedores.get(min_idx).getValorDevido()) {
                    min_idx = j;
                }
            }

            // Troca o elemento encontrado com o primeiro elemento da sublista não ordenada
            // ou seja, com o elemento na posição 'i'
            if (min_idx != i) {
                Devedor temp = listaDevedores.get(i);
                listaDevedores.set(i, listaDevedores.get(min_idx));
                listaDevedores.set(min_idx, temp);
                System.out.printf("Passo %d: Trocado '%s %s' com '%s %s'\n",
                                  i + 1,
                                  listaDevedores.get(min_idx).getNome(), listaDevedores.get(min_idx).getSobrenome(),
                                  listaDevedores.get(i).getNome(), listaDevedores.get(i).getSobrenome());
            } else {
                System.out.printf("Passo %d: O elemento na posição %d ('%s %s') já é o menor na sublista restante.\n",
                                  i + 1, i, listaDevedores.get(i).getNome(), listaDevedores.get(i).getSobrenome());
            }

            System.out.println("Lista após passo " + (i + 1) + ":");
            imprimirLista(listaDevedores);
            System.out.println("\n" + "=".repeat(50) + "\n");
        }
        System.out.println("--- Fim do Selection Sort ---");
    }

    private static void imprimirLista(List<Devedor> lista) {
        for (Devedor devedor : lista) {
            System.out.println(devedor);
        }
    }

    public static void main(String[] args) {
        // Criação da lista de devedores
        List<Devedor> devedores = new ArrayList<>();
        devedores.add(new Devedor("João", "Silva", 1500.75));
        devedores.add(new Devedor("Maria", "Souza", 800.50));
        devedores.add(new Devedor("Carlos", "Pereira", 2300.00));
        devedores.add(new Devedor("Ana", "Costa", 450.20));
        devedores.add(new Devedor("Pedro", "Santos", 1900.99));
        devedores.add(new Devedor("Paula", "Martins", 120.30));

        System.out.println("Lista de Devedores Original:");
        imprimirLista(devedores);
        System.out.println("\n" + "=".repeat(50) + "\n");

        // Ordena a lista usando Selection Sort e exibe os passos
        selectionSortDevedores(devedores);

        System.out.println("\n" + "=".repeat(50) + "\n");
        System.out.println("Lista de Devedores Ordenada por Valor Devido (Crescente):");
        imprimirLista(devedores);
    }
}