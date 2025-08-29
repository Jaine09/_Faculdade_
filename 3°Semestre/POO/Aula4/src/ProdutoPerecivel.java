public class ProdutoPerecivel extends Produto{
    private int validade;
    private int dia;

    public ProdutoPerecivel(String nome, int quantidade, double precoUnitario, int codigoDeBarra, int validade, int dia) {
        super(nome, quantidade, precoUnitario, codigoDeBarra);
        this.validade = validade;
        this.dia = dia;
    }

    public boolean estaValido(){
        return this.validade>= this.dia;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

}
