package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenacao  {

    private List<Pessoa> pessoaList;


    Ordenacao()  {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

  public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        //retorna pelo Comparable
      Collections.sort(pessoasPorIdade);
      return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        //retorna pelo Comparator
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    }

