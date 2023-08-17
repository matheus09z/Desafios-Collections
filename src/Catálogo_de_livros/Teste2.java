package Catálogo_de_livros;

public class Teste2 {
    public static void main(String[] args) {
        CatalogoLivros cat = new CatalogoLivros();
        cat.adicionarLivro("Plant", "Eduardo", 2015);
        cat.adicionarLivro("Bomb", "Maria", 2022);
        cat.adicionarLivro("Salva", "Matheus", 2016);
        cat.adicionarLivro("Pre", "jose", 2017);
        try {
            cat.pesquisarPorTitulo("no");
        } catch (NullPointerException e) {
            System.out.println("Excecao");
        }
    }
}

