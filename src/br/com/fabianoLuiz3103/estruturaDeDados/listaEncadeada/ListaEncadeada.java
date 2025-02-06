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
 *
 *            se por acidente o inicio for atribuido como null, todas as outras referÊncias (nós)
 *            são perdidos na memória -> é uma forma bem simples de limpar a lista -> null para o último tb
 */
public class ListaEncadeada<T> {

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    private final int NAO_ENCONTRADO = -1;

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

        if(!(posicao >= 0 && posicao < this.tamanho)){
           throw new IllegalArgumentException("\nPosição inválida! ");
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


}
