package List.livros;

public class Teste {
    public static void main(String[] args) {

        CatalogoLivros cat = new CatalogoLivros();
        cat.adicionarLivro("jackson", "markov", 2001);
        cat.adicionarLivro("jackso", "markov", 2041);
        cat.adicionarLivro("jack", "markov", 2044);

        cat.pesquisarPorAutor("markov");
    }
}
