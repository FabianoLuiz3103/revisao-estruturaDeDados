package br.com.fabianoLuiz3103.estruturaDeDados.fila;

/*
 Adicionar o elemento ordenado por prioridade
 extends a classe Fila porque usa todos os métodos dela

 obj1 > obj2 --> compareTo retorna >0
 obj1 < obj2 --> compareTo retorna < 0
 obj1 == obj2 --> compareTo retorna =0
 */
public class FilaComPrioridade<T> extends Fila<T> {


    public void adiciona(T elemento) {
        Comparable<T> chave = (Comparable<T>) elemento;
        int i;
        for(i = 0; i < super.tamanho; i++){
            if(chave.compareTo(this.elementos[i])<0){
                break;
            }
        }
        super.adiciona(elemento, i);
    }
}
