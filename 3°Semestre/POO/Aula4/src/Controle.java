public class Controle{

    private ProdutoPerecivel produto;


    public Controle(ProdutoPerecivel produto) {
        this.produto = produto;
    }

    public void verificaValidade(){
        System.out.println("\n################ Verificando validade ###################");
        if (produto.estaValido()){
            System.out.println(produto.getNome() + " esta valido!");
        }else{
            System.out.println(produto.getNome() + " nao esta valido!");
        }
    }

    @Override
    public String toString() {
        return "[Controle]" +
                " produto = " + produto;
    }
}
