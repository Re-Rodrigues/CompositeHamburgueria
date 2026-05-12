package org.hamburgueria;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Item {

    private String nome;
    private List<Item> itens = new ArrayList<>();

    public Combo(String nome) {
        this.nome = nome;
    }

    public void adicionar(Item item) {
        itens.add(item);
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        return total;
    }

    @Override
    public String getDescricao() {
        return nome;
    }
}