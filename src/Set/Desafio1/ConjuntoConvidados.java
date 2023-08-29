package Set.Desafio1;


import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> listaDeConvidados;

    ConjuntoConvidados() {
        this.listaDeConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoDoConvite) {
        listaDeConvidados.add(new Convidado(nome, codigoDoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado c = null;
        if (!listaDeConvidados.isEmpty()) {
            for (Convidado convidado : listaDeConvidados) {
                if (convidado.getCodigoDoConvite() == codigoConvite) {
                    c = convidado;
                    break;
                }
            }
            if (c == null) {
                throw new RuntimeException("não existe código do convite");

            }
            listaDeConvidados.remove(c);
        } else {
            System.out.println("Lista está vazia ");
        }
    }


    public int contarConvidados() {
        return listaDeConvidados.size();

    }

    public void exibirConvidados() {
        if (!listaDeConvidados.isEmpty()) {
            listaDeConvidados.forEach(convidado -> System.out.println(convidado));
        } else {
            System.out.println("Lista vazia");


        }
    }
}

