package br.com.fabianoLuiz3103.estruturaDeDados.fila;

import br.com.fabianoLuiz3103.estruturaDeDados.estruturaEstatica.EstruturaEstatica;


public class Fila <T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void adiciona(T elemento){
        super.adiciona(elemento);
    }



}
