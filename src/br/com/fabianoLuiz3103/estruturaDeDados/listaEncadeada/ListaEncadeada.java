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

    public void limpa(){
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
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
