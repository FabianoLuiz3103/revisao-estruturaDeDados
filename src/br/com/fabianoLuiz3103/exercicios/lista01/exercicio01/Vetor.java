package br.com.fabianoLuiz3103.exercicios.lista01.exercicio01;

/**
 * @author FabianoLuiz3103
 * --> Melhore a classe VetorGenerico e implemente o método
 * contém, semelhante ao método contains da classe ArrayList
 */
public class Vetor<T> {

    private T[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = (T[]) new Object[capacidade <= 0 ? 1 : capacidade];
        this.tamanho = 0;
    }

    public void adiciona(T elemento){
        this.aumentarCapacidade();
        this.elementos[this.tamanho]=elemento;
        this.tamanho++;
    }

    public void adiciona(T elemento, int posicao) throws IllegalArgumentException{
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida! ");
        }
        this.aumentarCapacidade();
        if(this.elementos[posicao] != null){
            for(int i = tamanho-1; i >= posicao; i--){
                this.elementos[i+1] = this.elementos[i];
            }
        }
        this.elementos[posicao]=elemento;
        this.tamanho++;
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
    /*
    if(busca(elemento) retornar 0 ou maior que 0 true
    senão false
     */
    public boolean contains(T elemento){
        return busca(elemento) >= 0;
    }

    private void aumentarCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) throws IllegalArgumentException{
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida! ");
        }
        for(int i = posicao; i < this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.elementos[tamanho-1] = null;
        this.tamanho--;
    }

    public int tamanho(){
        return this.tamanho;
    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < this.tamanho-1; i++){
            sb.append(this.elementos[i]);
            sb.append(",");
        }
        if(tamanho > 0){
            sb.append(elementos[tamanho-1]);
        }
        sb.append("]");
        return sb.toString();
    }
}
