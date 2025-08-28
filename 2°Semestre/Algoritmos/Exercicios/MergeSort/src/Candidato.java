public class Candidato {
    private String nome;
    private int votosSindico;
    private int votosSubstituicao; // Renomeado para subsíndico, para ser mais claro

    public Candidato(String nome, int votosSindico, int votosSubstituicao) {
        this.nome = nome;
        this.votosSindico = votosSindico;
        this.votosSubstituicao = votosSubstituicao;
    }

    public String getNome() {
        return nome;
    }

    public int getVotosSindico() {
        return votosSindico;
    }

    public int getVotosSubstituicao() {
        return votosSubstituicao;
    }

    // Calcula o total de votos para o candidato
    public int getTotalVotos() {
        return votosSindico + votosSubstituicao;
    }

    @Override
    public String toString() {
        return "Candidato: " + nome +
               " | Votos Síndico: " + votosSindico +
               " | Votos Subsíndico: " + votosSubstituicao +
               " | Total Votos: " + getTotalVotos();
    }
}