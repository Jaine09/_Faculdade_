public class AlunoBolsista extends Aluno{

    public AlunoBolsista(String nome, int idade, String curso, double nota, double mensalidade) {
        super(nome, idade, curso, nota, mensalidade);
    }

    //@override sobrescreve um metodo
    @Override
    public void pagarMensalidade() {
        System.out.println("Aluno bolsista nao precisa pagar.");
    }
}
