package br.com.fabianoLuiz3103.estruturaDeDados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
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

    public void adiciona(String elemento) throws Exception{
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho]=elemento;
            this.tamanho++;
        } else{
            throw new Exception("\n\t\tErro! O vetor já está cheio!");
        }
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
