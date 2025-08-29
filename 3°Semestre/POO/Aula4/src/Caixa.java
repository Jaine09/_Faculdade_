public class Caixa {
    private Produto produto;

    public Caixa(Produto produto) {
        this.produto = produto;
    }

    public void passarCompra(double valor){
        System.out.println("\n################ Passando compra ###################");
        if(valor < produto.getPreco()){
            System.out.println("Valor insuficiente!!");
        }else{
            produto.fazerCompra();
            double troco = valor-produto.getPreco();
            System.out.println("Troco: R$" + troco);
        }
    }

    @Override
    public String toString() {
        return "[Caixa] " +
                " produto = " + produto;
    }
}
