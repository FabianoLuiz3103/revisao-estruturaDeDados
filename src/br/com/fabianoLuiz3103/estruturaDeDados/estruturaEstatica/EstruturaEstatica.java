package br.com.fabianoLuiz3103.estruturaDeDados.estruturaEstatica;

public abstract class EstruturaEstatica<T>{

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(){
        this(10); //começa com 10 por padrão
        //está chamando o construtor abaixo
    }

    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade <= 0 ? 10 : capacidade];
        this.tamanho = 0;
    }

    public boolean isEmpty(){
        return this.tamanho==0;
    }

    protected void adiciona(T elemento){
        this.aumentarCapacidade();
        this.elementos[this.tamanho]=elemento;
        this.tamanho++;
    }

    protected void adiciona(T elemento, int posicao) throws IllegalArgumentException{
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

    private void aumentarCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    protected void remove(int posicao) throws IllegalArgumentException{
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
