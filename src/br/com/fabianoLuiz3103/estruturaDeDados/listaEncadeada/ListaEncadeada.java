package br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada;

import java.util.NoSuchElementException;

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
 *
 *            se por acidente o inicio for atribuido como null, todas as outras referÊncias (nós)
 *            são perdidos na memória -> é uma forma bem simples de limpar a lista -> null para o último tb
 */
public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    private final int NAO_ENCONTRADO = -1;
    private final String NAO_EXISTE = "Posição não existe!";
    private final String LISTA_VAZIA = "Lista está vazia!";

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

    private void adicionaNoIncio(T elemento){
        if(this.tamanho == 0){
            No<T> celula = new No<>(elemento);
            this.inicio = celula;
            this.ultimo = celula;
        }else{
            //lista não está vazia, definir novo ini
            this.inicio = new No<>(elemento, this.inicio); //inicio antigo vira o próximo do novo nó
        }
        this.tamanho++;
    }
    public void adiciona(int posicao, T elemento){
        if(this.posicaoNaoExiste(posicao, true)){
            throw new IllegalArgumentException(NAO_EXISTE);
        }
       if(posicao == 0){
           this.adicionaNoIncio(elemento);
       } else if(posicao == this.tamanho){
           this.adiciona(elemento);
       }else{
           No<T> noAnterior = this.buscaPorPosicao(posicao-1);
           No<T> proximoNo = noAnterior.getProximo();
           No<T> novoNo = new No<>(elemento, proximoNo);
           noAnterior.setProximo(novoNo);
           this.tamanho++;
       }
    }

    public T removeInicio(){
        if(this.tamanho == 0){
            throw new NoSuchElementException(LISTA_VAZIA);
        }
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo(); //se tiver um elemento o getProximo já retorna null
        this.tamanho--;
        if(this.tamanho==0){this.ultimo = null;} // se tiver só um elemento na lista, tem que fazer isso para o último não ficar apontando
        return removido;
    }

    public T removeFim(){
        if(this.tamanho == 0){
            throw new NoSuchElementException(LISTA_VAZIA);
        }
        if(this.tamanho == 1){
            return this.removeInicio();
        }
        No<T> penultimo = this.buscaPorPosicao(this.tamanho-2);
        T removido = penultimo.getProximo().getElemento();
        penultimo.setProximo(null);
        this.ultimo = penultimo; // o penúltimo agora é o último
        this.tamanho--;
        return removido;
    }



    public int getTamanho(){
        return this.tamanho;
    }

    //1º forma de limpar:
/*
    public void limpa(){
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
*/

    //2º forma de limpar - facilita para o coletor de lixo do java
    //forma mais otimizada
    public void limpa(){

        for(No<T> atual = this.inicio; atual!=null;){
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> buscaPorPosicao(int posicao){

        if(this.posicaoNaoExiste(posicao,false)){
           throw new IllegalArgumentException(NAO_EXISTE);
        }
        No<T> atual = this.inicio;
        for(int i =0; i < posicao; i++){
            atual = atual.getProximo();
        }
        return atual;
    }


    //busca por posição - retorna só o elemento, não o nó inteiro
    public T busca(int posicao){
        return this.buscaPorPosicao(posicao).getElemento();
    }

    //== faz comparação de referência
    //compareTo compara a ordem entre 2 objetos
    //equals verifica se 2 objetos são iguais
    public int busca(T elemento){
        No<T> atual = this.inicio;
        int posicao = 0;
        while (atual!=null){

            if(atual.getElemento().equals(elemento)){
                return posicao;
            }
            posicao++;
            atual = atual.getProximo();
        }
        return NAO_ENCONTRADO;
    }

    //[1,2,3,4]
    @Override
    public String toString() {
        if(this.tamanho == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        No<T> atual = this.inicio; //primeiro elemento
//        sb.append("[").append(atual.getElemento()).append(atual.getProximo()!=null?",":"");
//        while (atual.getProximo()!=null){
//            atual = atual.getProximo();
//            sb.append(atual.getElemento()).append(atual.getProximo()!=null?",":"");
//        }
//        sb.append("].");

        //[0, tamanho-1]
        //tamanho-1.prox é o último elemento
        //tamanho é o último elemento, se ele é o último aponta para null
        sb.append("[");
        for(int i = 0; i < this.tamanho; i++){
            sb.append(atual.getElemento()).append(atual.getProximo()!=null?",":"");
            atual = atual.getProximo();
        }
        sb.append("].");
        return sb.toString();
    }


    private boolean posicaoNaoExiste(int posicao, boolean isAdd){
        return (!(posicao >= 0 && (isAdd)?posicao <= this.tamanho
                : posicao < this.tamanho));
    }


}
