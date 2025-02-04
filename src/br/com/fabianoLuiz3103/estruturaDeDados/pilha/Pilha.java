package br.com.fabianoLuiz3103.estruturaDeDados.pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.estruturaEstatica.EstruturaEstatica;

import java.util.EmptyStackException;

/**
 *
 * @author FabianoLuiz3103
 * --> As linguagens de programação usam pilhas internas
 *--> Pilhas para chamadas de métodos, variáveis locais, etc
 * --> stackoverflow -> exceção chamada quando acaba a capacidade, estouro da pilha
 */
public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    //push()
    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    //peek()
    public T topo() throws EmptyStackException{
        if(!super.isEmpty()){
            return super.elementos[super.tamanho-1];
        }
        throw new EmptyStackException();
    }

}
