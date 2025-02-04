package br.com.fabianoLuiz3103.estruturaDeDados.teste.pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

public class Teste {

    public static void main(String[] args) {

        /*
        Por padrão inicia com 10, antes de aumentar a capacidade
         */
        Pilha<Integer> pilha = new Pilha<>();

        for(int i = 1; i <= 15; i++){
            pilha.empilha(i);
        }

        System.out.println(pilha);

    }
}
