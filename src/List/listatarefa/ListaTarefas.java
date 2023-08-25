package List.listatarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> tarefas = new ArrayList<>();


    public void adicionarTarefa(String descricao) {
        Tarefa tarefa1 = new Tarefa(descricao);
        tarefas.add(tarefa1);
    }

    public void removerTarefa(String tarefa) {
        List<Tarefa> l = new ArrayList<>();
        if (this.tarefas.isEmpty()) {
            for (Tarefa tarefa1 : tarefas) {
                if (tarefa1.getDescricao().equalsIgnoreCase(tarefa)) {
                    l.add(tarefa1);
                }
            }
            this.tarefas.removeAll(l);
        }
    }

    public int obterNumeroTotalTarefas() {
        return this.tarefas.size();
    }

    public void obterDescricoesTarefas() {
        for (Tarefa tarefa : tarefas) {
           System.out.println(tarefa.getDescricao());
        }
    }
}
