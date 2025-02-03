package br.com.fabianoLuiz3103.estruturaDeDados.vetor;


public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade <= 0 ? 1 : capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento){
        for(int i = 0; i < this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    public void adiciona(String elemento){
            this.aumentarCapacidade();
            this.elementos[this.tamanho]=elemento;
            this.tamanho++;
    }

    public void adiciona(String elemento, int posicao) throws IllegalArgumentException{
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

    public String busca(int posicao) throws IllegalArgumentException{
       if(!(posicao >= 0 && posicao < tamanho)){
           throw new IllegalArgumentException("Posição inválida! ");
       }
       return this.elementos[posicao];

    }

    //sobrecarga
    //Busca sequencial
    //Retorna o indice
    public int busca(String elemento) {
       for(int i = 0; i < tamanho; i++){
           if(this.elementos[i].equals(elemento)){
               return i;
           }
       }
       return -1;
    }

    //Método para adicionar capacidade
    private void aumentarCapacidade(){
       if(this.tamanho == this.elementos.length){
           String[] elementosNovos = new String[this.elementos.length*2];
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
        /*
        o último elemento do vetor continuará com o mesmo valor, mas o
        tamanho lógico não, esse último elemento será sobrescrito quando
        um novo elemento for adicionado, mas eu posso fazer isso
        this.elementos[tamanho-1] = null
        tamanho-1 é o novo tamanho lógico, então se for 4
        [0,3] a posição 4 (por ser a próxima pos "vazia" ) será sobrescrita com um novo valor ao add
         */
        this.elementos[tamanho-1] = null;
        this.tamanho--;
    }

    public int tamanho(){
        return this.tamanho;
    }


    @Override
    public String toString() {
        /*
        Exemplo -> this.elementos = {1, 2}
        for(i < 2-1) --> Até a penúltima posição com vírgula
        this.elementos[0] = 1
        ,
        if(tamanho > 0){
        coloca a útima posição sem vírgula depois
        }
         */
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
