package List.ordenacao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> listaInteiros = new ArrayList<>();


    public void adicionarNumero(int numero) {
        this.listaInteiros.add(numero);
    }


    public List<Integer> ordenarAscendente() {
        if (!listaInteiros.isEmpty()) {
            Collections.sort(listaInteiros);
            return listaInteiros;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        if (!listaInteiros.isEmpty()) {
            listaInteiros.sort(Collections.reverseOrder());
            return listaInteiros;
        } else {
            throw new RuntimeException("Lista vazia");
        }
    }
}


