package br.com.fabianoLuiz3103.estruturaDeDados.teste.listaEncadeada;

import br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.ListaEncadeada;

public class Teste01 {

    public static void main(String[] args) {

        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();
        listaEncadeada.adiciona(1);
        System.out.println(listaEncadeada);
        listaEncadeada.adiciona(2);
        listaEncadeada.adiciona(3);
        listaEncadeada.adiciona(4);
        System.out.println(listaEncadeada.getTamanho());

        System.out.println(listaEncadeada);
       // listaEncadeada.limpa();
        System.out.println(listaEncadeada);

       int index = listaEncadeada.busca(Integer.valueOf(4));
       int i = listaEncadeada.busca(-1);


    }
}
