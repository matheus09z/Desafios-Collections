package List.Desafio2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
  List<Item> itemList = new ArrayList<>();


  public void adicionarItem(String nome, double valor, int quantidade) {
      itemList.add(new Item(nome, valor, quantidade));
  }

  public void removerItem(String nome) {
      List<Item> lista = new ArrayList<>();
      if (!itemList.isEmpty()) {
          for (Item i : itemList) {
              if (i.getNome().equalsIgnoreCase(nome)) {
                  lista.add(i);
              }
          }
          itemList.removeAll(lista);
      }else
      System.out.println("Lista está vazia");
  }


  public double calcularValorTotal() {
      double valor = 0;
      for(Item item: itemList) {
        valor += item.getValor() * item.getQuantidade();
      }
      return valor;
  }
  public List<Item> exibirItem() {

      return itemList;
  }

}
