public class Aula3 {
    public static void main(String[] args) {

        Professor prof = new Professor("Lara", 30, 20, 20000.00);
        prof.fazAniversario();
        prof.receberSalario();
        System.out.println(prof.getIdade()+ "\n");

        Aluno aluno1 = new Aluno("Mariana", 16, "adm", 5.9, 418.0);
        aluno1.fazAniversario();
        aluno1.verificarAprovacao();
        aluno1.pagarMensalidade();
        System.out.println(aluno1.getIdade()+ "\n");

        Aluno aluno2 = new Aluno("Karina", 21, "Marketing", 8.9, 600.0);
        aluno2.fazAniversario();
        aluno2.verificarAprovacao();
        aluno2.pagarMensalidade();
        System.out.println(aluno2.getIdade() + "\n");

        Aluno aluno3 = new AlunoBolsista("Joana Bolsista", 23, "Design", 3.9, 700.0);
        aluno3.fazAniversario();
        aluno3.verificarAprovacao();
        aluno3.pagarMensalidade();
        System.out.println(aluno3.getIdade());

    }
}
