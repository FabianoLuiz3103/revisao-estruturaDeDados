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
       try{
           return super.elementos[0];
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("\n\tA fila está vazia");
           return null;
       }
    }

    public T ultimoDaFila(){
        try{
            return super.elementos[super.tamanho-1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\n\tA fila está vazia");
            return null;
        }
    }

}
