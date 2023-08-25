package List.ordenacao2;

public class TesteMain {

    public static void main(String[] args) {


        OrdenacaoNumeros ordenar = new OrdenacaoNumeros();
        ordenar.adicionarNumero(1);
        ordenar.adicionarNumero(2);
        ordenar.adicionarNumero(3);
        ordenar.adicionarNumero(4);
        ordenar.adicionarNumero(5);

        System.out.println(ordenar.ordenarAscendente());
        System.out.println(ordenar.ordenarDescendente());
        System.out.println(ordenar.ordenarAscendente());


    }
}
