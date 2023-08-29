package Set.Desafio2;

public class Teste1 {
    public static void main(String[] args) {

        AgendaContato agenda = new AgendaContato();
        agenda.adicionarContato("matheus", 12855);
        agenda.adicionarContato("jose", 126665);
        agenda.adicionarContato("maria", 123435);
        agenda.adicionarContato("pedro", 128551);


        agenda.exibirContatos();

        System.out.println(agenda.pesquisarPorNome("jose"));
        System.out.println(agenda.pesquisarPorNome("maria"));

        System.out.println(agenda.atualizarNumeroDeContato("jose" , 131313));

        agenda.exibirContatos();
    }
}
