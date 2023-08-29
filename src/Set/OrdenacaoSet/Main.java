package Set.OrdenacaoSet;

public class Main {

    public static void main(String[] args)  {
        CadastroProduto cadastroProduto =  new CadastroProduto();

        cadastroProduto.adicionarProduto("produto 1", 8, 15d, 10);
        cadastroProduto.adicionarProduto("produto 2", 1, 13d, 5);
        cadastroProduto.adicionarProduto("produto 3", 2, 12d, 1);
        cadastroProduto.adicionarProduto("produto 4", 4, 11d, 19);


        System.out.println(cadastroProduto.produtoSet);


        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirProdutosPorPreco());
    }
}
