package br.com.fabianoLuiz3103.estruturaDeDados.teste.listaEncadeada;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        System.out.println(lista);

        lista.removeLast(); //removendo último

        System.out.println(lista);

        lista.removeFirst(); //removendo primeiro
        System.out.println(lista);

        System.out.println(lista.contains("G"));
    }
}
