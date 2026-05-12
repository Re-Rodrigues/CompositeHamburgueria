package org.hamburgueria;

public class Main {
    public static void main(String[] args) {

        Produto burger = new Produto("Hamburguer", 15.0);
        Produto batata = new Produto("Batata", 10.0);
        Produto refri = new Produto("Refrigerante", 5.0);

        Combo combo = new Combo("Combo 1");
        combo.adicionar(burger);
        combo.adicionar(batata);
        combo.adicionar(refri);

        System.out.println(combo.getDescricao());
        System.out.println("Total: R$ " + combo.getPreco());
    }
}