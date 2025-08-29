public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Leite",2,5.90,123456 );
        System.out.println(p1.getNome());
        System.out.println(p1);

        Caixa c1 = new Caixa(p1);
        c1.passarCompra(50);
        System.out.println(c1);

        Produto p2 = new Produto("Sucrilhos",5,15.00,1122334455 );
        Caixa c2 = new Caixa(p2);
        c2.passarCompra(100);
        System.out.println(c2);

        System.out.println("\n################ Produto Perecivel ###################");
        ProdutoPerecivel feijao = new ProdutoPerecivel("Feijao",2,16.00, 156987456,15,28);
        System.out.println(feijao);
        System.out.println("Validade: " + feijao.estaValido());

        Controle controle = new Controle(feijao);
        controle.verificaValidade();

    }
}
