package List.Catálogo_de_livros;

public class Teste2 {
    public static void main(String[] args) {
        CatalogoLivros cat = new CatalogoLivros();
        cat.adicionarLivro("Plant", "Eduardo", 2015);
        cat.adicionarLivro("bomb", "Eduardo", 2022);
        cat.adicionarLivro("bomb", "Matheus", 2016);
        cat.adicionarLivro("Pre", "jose", 2017);
        try {
            cat.pesquisarPorTitulo("no");
        } catch (NullPointerException e) {
            System.out.println("Excecao");
        }

        System.out.println(cat.pesquisarPorIntervaloAnos(2015, 2017));
        System.out.println(cat.pesquisarPorAutor("Eduardo"));
        System.out.println(cat.pesquisarPorTitulo("bomb"));
    }
}

