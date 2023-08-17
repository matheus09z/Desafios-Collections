package Desafio2;

public class Teste {

    public static void main(String[] args) {
        Item item = new Item("baisebal", 1500, 5);
        Item item2 = new Item("baibal", 1000, 8);
        Item item3 = new Item("bail", 1600, 3);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("cenoura", 40.5, 3);
        carrinho.adicionarItem("batata", 30 , 5);
        carrinho.calcularValorTotal();
        System.out.println(carrinho.exibirItem());


        carrinho.removerItem("cenoura");

        System.out.println(carrinho.exibirItem());
        System.out.println(carrinho.calcularValorTotal());


    }
}
