package List.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
        Livro livro = new Livro(titulo, autor, anoDePublicacao);
        livrosList.add(livro);
    }

    public void pesquisarPorAutor(String autor) {
        List<Livro> livro = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro1 : livrosList) {
                if (livro1.getAutor().equalsIgnoreCase(autor)) {
                    livro.add(livro1);
                }
            }
            System.out.println("lista vazia");
    }
        livro.forEach(palavra -> System.out.println(palavra));

}

}
