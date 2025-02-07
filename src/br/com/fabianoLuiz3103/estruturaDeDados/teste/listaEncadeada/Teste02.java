package br.com.fabianoLuiz3103.estruturaDeDados.teste.listaEncadeada;

import br.com.fabianoLuiz3103.estruturaDeDados.listaEncadeada.ListaEncadeada;

public class Teste02 {

    public static void main(String[] args) {

        ListaEncadeada<String> lista = new ListaEncadeada<>();
        lista.adiciona("A");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");
        lista.adiciona(1,"B");
        lista.adiciona(5,"F");

        System.out.println(lista);

       System.out.println(lista.removeQualquerPosicao(5));

       System.out.println(lista);
       System.out.println(lista.getTamanho());

        System.out.println(lista.removeQualquerPosicao(2));

        System.out.println(lista);
        System.out.println(lista.getTamanho());

    }
}
