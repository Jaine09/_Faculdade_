public class Aluno extends Pessoa{

    private String curso;
    private double nota;
    private double mensalidade;


    public Aluno(String nome, int idade,String curso, double nota, double mensalidade) {
        setNome(nome);
        setIdade(idade);
        this.curso = curso;
        this.nota = nota;
        this.mensalidade = mensalidade;
    }

    public void verificarAprovacao(){
        if (this.nota >= 6){
            System.out.printf("Aluno aprovado com nota %s\n", this.nota);
        }else{
            System.out.printf("Aluno reprovado com nota %s\n", this.nota);
        }
    }

    public void pagarMensalidade(){
        System.out.printf("%s tem a mensalidade paga!\n", getNome());
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
