package br.com.fabianoLuiz3103.exercicios.lista04linkedList.exercicio03;

public class TesteEx03 {

    public static void main(String[] args) {

        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();
        ListaEncadeada<String> listaEncadeada2 = new ListaEncadeada<>();

        listaEncadeada.adicionaOrdenado("B", String::compareTo);
        listaEncadeada.adicionaOrdenado("F",  String::compareTo);
        listaEncadeada.adicionaOrdenado("D",  String::compareTo);

        listaEncadeada2.adicionaOrdenado("E",  String::compareTo);
        listaEncadeada2.adicionaOrdenado("A",  String::compareTo);
        listaEncadeada2.adicionaOrdenado("C",  String::compareTo);


        System.out.println(listaEncadeada);
        System.out.println(listaEncadeada2);

    }
}
