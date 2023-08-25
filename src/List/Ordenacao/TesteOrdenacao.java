package List.Ordenacao;

public class TesteOrdenacao {
    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();

        ordenacao.adicionarPessoa("flavio", 25, 1.80);
        ordenacao.adicionarPessoa("jose", 23, 1.70);
        ordenacao.adicionarPessoa("maria", 27, 1.60);
        ordenacao.adicionarPessoa("antonio", 21, 1.50);

        System.out.println(ordenacao.ordenarPorIdade());
        System.out.println(ordenacao.ordenarPorAltura());
    }
}

