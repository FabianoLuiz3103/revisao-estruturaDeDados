package br.com.fabianoLuiz3103.estruturaDeDados.pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.estruturaEstatica.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

}
