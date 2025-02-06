package br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada;

/**
 *  O nó que era o último antes da inserção agora aponta para um novo
 *            nó
 *            Exemplo: A, B, C
 *            inicio = A
 *            fim = A
 *            A.prox = B
 *            ultimo = B
 *            ini -> A -> B -> null
 *            fim -> B -> null
 *            inicio e fim são variáveis que armazenam referência p/ cada nó
 */
public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento){
        No<T> celula = new No<>(elemento); //inicio apontando para o primeiro nó
        if(this.tamanho == 0){
            this.inicio = celula;
        }else{
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;

    }

    public int getTamanho(){
        return this.tamanho;
    }

    //[1,2,3,4]
    @Override
    public String toString() {
        if(this.tamanho == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        No<T> atual = this.inicio; //primeiro elemento
        sb.append("[").append(atual.getElemento()).append(atual.getProximo()!=null?",":"");
        while (atual.getProximo()!=null){
            atual = atual.getProximo();
            sb.append(atual.getElemento()).append(atual.getProximo()!=null?",":"");
        }
        sb.append("].");
        return sb.toString();
    }


}
