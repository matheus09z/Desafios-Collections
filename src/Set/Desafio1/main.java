package Set.Desafio1;

import Set.Desafio1.ConjuntoConvidados;

public class main {
    public static void main(String[] args) {


        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.adicionarConvidado("matheus", 2);
        conjunto.adicionarConvidado("matheus", 3);
        conjunto.adicionarConvidado("matheus", 4);
        conjunto.adicionarConvidado("matheus", 5);
        conjunto.adicionarConvidado("matheuss", 5);

        System.out.println(conjunto.contarConvidados());

        conjunto.removerConvidadoPorCodigoConvite(4);

        System.out.println(conjunto.contarConvidados());

        conjunto.exibirConvidados();;


    }
}
