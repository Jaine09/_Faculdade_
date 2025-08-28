public class Professor extends Pessoa{

    private int cargaHoraria;
    private double salario;

    public Professor(String nome, int idade, int cargaHoraria, double salario) {
        setNome(nome);
        setIdade(idade);
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }

    public void receberSalario(){
        System.out.println(getNome() + " recebe o salario de " + this.salario);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
