package List.Catálogo_de_livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> livro;


    CatalogoLivros() {
        this.livro = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
        Livro livro1 = new Livro(titulo, autor, anoDePublicacao);
        livro.add(livro1);

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livro1 = new ArrayList<>();
        if (!this.livro.isEmpty()) {
            for (Livro livro : livro) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livro1.add(livro);
                }
            }
            return livro1;
        } else {
       throw new RuntimeException("lista está vazia");

        }
    }
   public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(livrosPorIntervaloDeAnos.isEmpty()) {
            for (Livro livro : livro) {
                if (livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnos.add(livro);
                }
            }
            return livrosPorIntervaloDeAnos;
        }else {
            throw new RuntimeException("Lista está vazia");

        }
    }
    public Livro pesquisarPorTitulo(String titulo) {
            Livro livros = null;

            for (Livro livro : livro) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livros = livro;
                    break;
                }
            }if(livros == null) {
                throw new NullPointerException();
        }
            return livros;
        }

        }



