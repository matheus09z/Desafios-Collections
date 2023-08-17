package Desafio2;

import java.math.BigDecimal;

public class Item {
    private String nome;
    private double valor;
    private int quantidade;


    Item(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public double getValor( ){
        return valor;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "nome é " + nome + "preço é " +
                valor + "Quantidade é" + quantidade;
    }
}
