package Set.Desafio1;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoDoConvite;


    Convidado(String nome, int codigoDoConvite){
        this.nome = nome;
        this.codigoDoConvite = codigoDoConvite;
    }


    public String getNome() {
        return nome;
    }

    public int getCodigoDoConvite() {
        return codigoDoConvite;
    }
    @Override
    public String toString() {
        return "Nome do convidado; " + nome + "codigo do convite: " + codigoDoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoDoConvite == convidado.codigoDoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDoConvite);
    }
}
