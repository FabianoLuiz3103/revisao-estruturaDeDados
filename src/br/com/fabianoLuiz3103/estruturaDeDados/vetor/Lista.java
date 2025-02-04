package br.com.fabianoLuiz3103.estruturaDeDados.vetor;

import br.com.fabianoLuiz3103.estruturaDeDados.estruturaEstatica.EstruturaEstatica;


public class Lista<T> extends EstruturaEstatica<T> {

    public Lista(){
        super();
    }

    public Lista(int capacidade) {
        super(capacidade);
    }

    public void adiciona(T elemento){
      super.adiciona(elemento);
    }

    public void adiciona(T elemento, int posicao) throws IllegalArgumentException{
        super.adiciona(elemento, posicao);
    }

    public void remove(int posicao) throws IllegalArgumentException{
        super.remove(posicao);
    }

    public T busca(int posicao) throws IllegalArgumentException{
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida! ");
        }
        return this.elementos[posicao];

    }

    public int busca(T elemento) {
        for(int i = 0; i < tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
}
