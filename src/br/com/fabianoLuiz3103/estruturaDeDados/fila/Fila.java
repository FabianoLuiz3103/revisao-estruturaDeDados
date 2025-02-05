package br.com.fabianoLuiz3103.estruturaDeDados.fila;

import br.com.fabianoLuiz3103.estruturaDeDados.estruturaEstatica.EstruturaEstatica;

import java.util.NoSuchElementException;


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


    public void remove(){
        try{
            super.remove(0);
        }catch (IllegalArgumentException e){
            System.out.println("\n\tA fila está vazia!");
        }
    }

    public T primeiroDaFila(){
        if(super.isEmpty()){
            throw new NoSuchElementException("\n\tA fila está vazia!");
        }
        return super.elementos[0];
    }

    public T ultimoDaFila(){
        if(super.isEmpty()){
            throw new NoSuchElementException("\n\tA fila está vazia!");
        }
        return super.elementos[super.tamanho-1];
    }

}
