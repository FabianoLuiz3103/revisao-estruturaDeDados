package br.com.fabianoLuiz3103.estruturaDeDados.fila;

/*
 Adicionar o elemento ordenado por prioridade
 extends a classe Fila porque usa todos os métodos dela

 obj1 > obj2 --> compareTo retorna >0
 obj1 < obj2 --> compareTo retorna < 0
 obj1 == obj2 --> compareTo retorna =0

 A classe que eu criar tem que implements a interface Comparable e implementar o método compareTo
 nele eu posso definir se um objeto vai ser maior que o outro pela idade, salário, etc
 */
public class FilaComPrioridade<T> extends Fila<T> {

    private boolean minHeap;

    public FilaComPrioridade(){
        this.minHeap = true; //default
    }

    public FilaComPrioridade(boolean minHeap) {
        this.minHeap = minHeap;
    }

    public FilaComPrioridade(int capacidade, boolean minHeap) {
        super(capacidade);
        this.minHeap = minHeap;
    }

    public void adiciona(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for(i = 0; i < super.tamanho; i++){
            if(minHeap ? chave.compareTo(this.elementos[i])<0 :
                    chave.compareTo(this.elementos[i])>0){
                break;
            }
        }
        super.adiciona(elemento, i);
    }
}
