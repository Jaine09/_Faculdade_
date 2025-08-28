import java.util.Scanner;

public class QuebraCabeca {
    private int[][] matriz;
    private int movimentos;

    // Construtor
    public QuebraCabeca(int[][] matrizInicial) {
        this.matriz = matrizInicial;
        this.movimentos = 0;
    }

    
    public void imprimir() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print("   "); 
                } else {
                    System.out.print(matriz[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    public boolean moverPeca(String direcao) {
        // Encontrar a posição do 0
        int[] posZero = encontrarZero();
        int linha = posZero[0];
        int coluna = posZero[1];

        int novaLinha = linha;
        int novaColuna = coluna;

        switch (direcao) {
            case "cima":
                novaLinha = linha - 1;
                break;
            case "baixo":
                novaLinha = linha + 1;
                break;
            case "esquerda":
                novaColuna = coluna - 1;
                break;
            case "direita":
                novaColuna = coluna + 1;
                break;
            default:
                System.out.println("Movimento inválido!");
                return false;
        }

        if (novaLinha >= 0 && novaLinha < 3 && novaColuna >= 0 && novaColuna < 3) {
            
            matriz[linha][coluna] = matriz[novaLinha][novaColuna];
            matriz[novaLinha][novaColuna] = 0;
            movimentos++;
            return true;
        }

        System.out.println("Movimento inválido!");
        return false;
    }

    private int[] encontrarZero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return null;  
    }

    public boolean jogoResolvido() {
        int[][] objetivo = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != objetivo[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);

       
        while (!jogoResolvido()) {
            System.out.println("\nQuebra-cabeça atual:");
            imprimir();

            System.out.print("\nDigite o movimento (cima, baixo, esquerda, direita): ");
            String movimento = scanner.nextLine().toLowerCase();

            if (!moverPeca(movimento)) {
                System.out.println("Movimento inválido, tente novamente.");
            }
        }

        System.out.println("\nParabéns! Você resolveu o quebra-cabeça.");
        System.out.println("Movimentos realizados: " + movimentos);
    }

    public static void main(String[] args) {
        // Matriz inicial embaralhada
        int[][] matrizInicial = {
            {1, 2, 3},
            {5, 6, 4},
            {7, 8, 0}
        };

        QuebraCabeca quebraCabeca = new QuebraCabeca(matrizInicial);
        quebraCabeca.jogar();
    }
}

