package br.com.fabianoLuiz3103.estruturaDeDados.teste.pilha;

import br.com.fabianoLuiz3103.estruturaDeDados.pilha.Pilha;

public class Teste {

    public static void main(String[] args) {

        /*
        Por padrão inicia com 10, antes de aumentar a capacidade
         */
        Pilha<Integer> pilha = new Pilha<>();
        try{
            pilha.empilha(1);
            pilha.empilha(2);
            pilha.empilha(3);
            System.out.println(pilha);
          System.out.println(pilha.desempilha());
            System.out.println(pilha.desempilha());
            System.out.println(pilha.desempilha());
            System.out.println(pilha.desempilha());
        }catch (Exception e){
            System.out.println("A pilha está vazia");
        }
        System.out.println(pilha);

    }
}
