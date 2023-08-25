package List.Catálogo_de_livros;

public class Livro {
    String titulo;
    String autor;
    int anoDePublicacao;



    Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
        this.autor = autor;
    }
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDePublicacao=" + anoDePublicacao +
                '}';
    }

    public String getAutor() {
        return autor;
    }
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    public String getTitulo() {
        return titulo;
    }
}
