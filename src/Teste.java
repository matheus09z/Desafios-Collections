public class Teste {
    public static void main(String[] args) {
        ListaTarefas listaT = new ListaTarefas();
        listaT.adicionarTarefa("Limpar");
        listaT.adicionarTarefa("Agir");
        listaT.adicionarTarefa("Contribuir");

        System.out.println(listaT.obterNumeroTotalTarefas());
        listaT.obterDescricoesTarefas();
        listaT.removerTarefa("Limpar");




        System.out.println(listaT.obterNumeroTotalTarefas());
    }
}
