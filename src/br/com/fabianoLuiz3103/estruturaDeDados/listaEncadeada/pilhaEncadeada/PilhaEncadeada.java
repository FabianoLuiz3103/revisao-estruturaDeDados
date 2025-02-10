package br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.pilhaEncadeada;

import br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.ListaEncadeada;

import java.util.EmptyStackException;

/**
 * Pilha usando estrutura de dados dinâmica
 */
public class PilhaEncadeada<T> {

    private ListaEncadeada<T> elementos;

    public PilhaEncadeada(){
        this.elementos = new ListaEncadeada<>();
    }

    public boolean isEmpty(){
        return this.elementos.getTamanho() == 0;
    }

    public int tamanho(){
        return this.elementos.getTamanho();
    }

    public void push(T elemento){
        this.elementos.adiciona(elemento);
    }

    public T peek(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        return this.elementos.busca(this.elementos.getTamanho()-1);
    }

    public T pop(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        return this.elementos.removeFim();
    }

    @Override
    public String toString() {
       return this.elementos.toString();
    }
}
