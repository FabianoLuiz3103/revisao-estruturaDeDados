package br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.filaEncadeada;

import br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.ListaEncadeada;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class FilaEncadeada<T> {

    ListaEncadeada<T> elementos;

    public FilaEncadeada(){
        this.elementos = new ListaEncadeada<>();
    }

    public boolean isEmpty(){
        return this.elementos.getTamanho() == 0;
    }

    public int size(){
        return this.elementos.getTamanho();
    }

    public void add(T elemento){
        this.elementos.adiciona(elemento);
    }

    public T peek(){
        if(this.isEmpty()){
            throw new NoSuchElementException("Fila vazia!");
        }
        return this.elementos.busca(0);
    }

    public T remove(){
        if(this.isEmpty()){
            throw new NoSuchElementException("Fila vazia!");
        }
        return this.elementos.removeInicio();
    }

    public void clear(){
        this.elementos.limpa();
    }

    @Override
    public String toString() {
        return this.elementos.toString();
    }
}
