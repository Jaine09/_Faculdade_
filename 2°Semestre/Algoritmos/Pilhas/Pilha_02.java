public class Pilha_02 {
    
    public static void main(String[] args) {
        Pilha_02 p = new Pilha_02();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
        
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }

    // declarando o array
    Object[] pilha;

    // variavel para armazenar a posição atual da pilha
    int posicaoPilha;

    // crinado um construtor e inicializando a pilha
    public Pilha_02() {
        this.posicaoPilha = -1; // ésta nula significa que não armazena informacao
        this.pilha = new Object[10];
    }

    // fazendo a verificação para ver se a pilha está vazia
    public boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }

    // verificando a quantidade de itens na pilha
    public int tamanho() {
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }

    // empilhando os itens
    public void empilhar(Object valor) {
        // push
        if (this.posicaoPilha < this.pilha.length) {
            // verifica se a posicaoPilha é menor do que o tamanho da pilha,
            // se for, então é inserido o valor na pilha e ao mesmo tempo é feito
            // o incremento do atributo posicaoPilha
            this.pilha[++posicaoPilha] = valor;
        }
    }

    //removendo itens
    public Object desempilhar(){
        //pop
        // verificando se a pilha esta vazia, se estiver nada será realizado
        if (pilhaVazia()) {
            return null;
        }
        //retorna o que tem na ultima posicao e decrementa o atributo
        return this.pilha[this.posicaoPilha --];

    }
}