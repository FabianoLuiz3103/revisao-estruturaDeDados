package br.com.fabianoLuiz3103.estruturaDeDados.teste.listaEncadeada;

import br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.ListaEncadeada;

public class Teste02 {

    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adiciona("A");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.adiciona(5,"B");
        System.out.println(lista);
    }
}
