import java.util.ArrayList;
import java.util.List;

public class Eleicao {

    public enum CriterioOrdenacao {
        TOTAL_VOTOS,
        VOTOS_SINDICO,
        VOTOS_SUBSINDICO
    }

    // Método principal do Merge Sort
    public static void mergeSortCandidatos(List<Candidato> candidatos, CriterioOrdenacao criterio) {
        if (candidatos == null || candidatos.size() < 2) {
            return; // Nada para ordenar
        }
        mergeSort(candidatos, 0, candidatos.size() - 1, criterio);
    }

    private static void mergeSort(List<Candidato> candidatos, int left, int right, CriterioOrdenacao criterio) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(candidatos, left, mid, criterio);
            mergeSort(candidatos, mid + 1, right, criterio);
            merge(candidatos, left, mid, right, criterio);
        }
    }

    private static void merge(List<Candidato> candidatos, int left, int mid, int right, CriterioOrdenacao criterio) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Cria listas temporárias
        List<Candidato> leftArray = new ArrayList<>();
        List<Candidato> rightArray = new ArrayList<>();

        // Copia os dados para as listas temporárias
        for (int i = 0; i < n1; i++) {
            leftArray.add(candidatos.get(left + i));
        }
        for (int j = 0; j < n2; j++) {
            rightArray.add(candidatos.get(mid + 1 + j));
        }

        // Mescla as listas temporárias de volta na lista original
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            boolean shouldSwap = false;
            if (criterio == CriterioOrdenacao.TOTAL_VOTOS) {
                shouldSwap = leftArray.get(i).getTotalVotos() >= rightArray.get(j).getTotalVotos();
            } else if (criterio == CriterioOrdenacao.VOTOS_SINDICO) {
                shouldSwap = leftArray.get(i).getVotosSindico() >= rightArray.get(j).getVotosSindico();
            } else if (criterio == CriterioOrdenacao.VOTOS_SUBSINDICO) {
                shouldSwap = leftArray.get(i).getVotosSubstituicao() >= rightArray.get(j).getVotosSubstituicao();
            }

            if (shouldSwap) {
                candidatos.set(k, leftArray.get(i));
                i++;
            } else {
                candidatos.set(k, rightArray.get(j));
                j++;
            }
            k++;
        }

        // Copia os elementos restantes de leftArray, se houver
        while (i < n1) {
            candidatos.set(k, leftArray.get(i));
            i++;
            k++;
        }

        // Copia os elementos restantes de rightArray, se houver
        while (j < n2) {
            candidatos.set(k, rightArray.get(j));
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Ana", 150, 80));
        candidatos.add(new Candidato("Bruno", 120, 90));
        candidatos.add(new Candidato("Carla", 200, 50));
        candidatos.add(new Candidato("Daniel", 100, 110));
        candidatos.add(new Candidato("Eva", 180, 70));

        System.out.println("--- Candidatos antes da ordenação ---");
        for (Candidato c : candidatos) {
            System.out.println(c);
        }

        // Exemplo de ordenação por total de votos
        System.out.println("\n--- Candidatos ordenados por Total de Votos (Decrescente) ---");
        Eleicao.mergeSortCandidatos(candidatos, Eleicao.CriterioOrdenacao.TOTAL_VOTOS);
        for (Candidato c : candidatos) {
            System.out.println(c);
        }

        // Reinicia a lista para demonstrar outra ordenação
        candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Ana", 150, 80));
        candidatos.add(new Candidato("Bruno", 120, 90));
        candidatos.add(new Candidato("Carla", 200, 50));
        candidatos.add(new Candidato("Daniel", 100, 110));
        candidatos.add(new Candidato("Eva", 180, 70));

        // Exemplo de ordenação por votos para síndico
        System.out.println("\n--- Candidatos ordenados por Votos para Síndico (Decrescente) ---");
        Eleicao.mergeSortCandidatos(candidatos, Eleicao.CriterioOrdenacao.VOTOS_SINDICO);
        for (Candidato c : candidatos) {
            System.out.println(c);
        }

        // Reinicia a lista para demonstrar outra ordenação
        candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Ana", 150, 80));
        candidatos.add(new Candidato("Bruno", 120, 90));
        candidatos.add(new Candidato("Carla", 200, 50));
        candidatos.add(new Candidato("Daniel", 100, 110));
        candidatos.add(new Candidato("Eva", 180, 70));

        // Exemplo de ordenação por votos para subsíndico
        System.out.println("\n--- Candidatos ordenados por Votos para Subsíndico (Decrescente) ---");
        Eleicao.mergeSortCandidatos(candidatos, Eleicao.CriterioOrdenacao.VOTOS_SUBSINDICO);
        for (Candidato c : candidatos) {
            System.out.println(c);
        }
    }
}
