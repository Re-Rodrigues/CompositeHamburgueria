package org.hamburgueria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComboTest {

    @Test
    void deveCalcularPrecoProdutoSimples() {
        Produto burger = new Produto("Hamburguer", 15.0);

        assertEquals(15.0, burger.getPreco());
    }

    @Test
    void deveCalcularPrecoCombo() {
        Produto burger = new Produto("Hamburguer", 15.0);
        Produto batata = new Produto("Batata", 10.0);
        Produto refri = new Produto("Refrigerante", 5.0);

        Combo combo = new Combo("Combo");
        combo.adicionar(burger);
        combo.adicionar(batata);
        combo.adicionar(refri);

        assertEquals(30.0, combo.getPreco());
    }

    @Test
    void devePermitirComboDentroDeCombo() {
        Produto burger = new Produto("Hamburguer", 15.0);
        Produto batata = new Produto("Batata", 10.0);

        Combo combo1 = new Combo("Combo 1");
        combo1.adicionar(burger);

        Combo combo2 = new Combo("Combo 2");
        combo2.adicionar(combo1);
        combo2.adicionar(batata);

        assertEquals(25.0, combo2.getPreco());
    }
}