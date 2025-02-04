package br.com.fabianoLuiz3103.estruturaDeDados.teste.pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

public class Teste {

    public static void main(String[] args) {

        /*
        Por padrão inicia com 10, antes de aumentar a capacidade
         */
        Pilha<Integer> pilha = new Pilha<>();
        pilha.empilha(1);
        pilha.empilha(2);
        try{
            System.out.println(pilha.topo());
        }catch (Exception e){
            System.out.println("A pilha está vazia");
        }

    }
}
