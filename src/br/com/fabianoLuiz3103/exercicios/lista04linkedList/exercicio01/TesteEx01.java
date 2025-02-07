package br.com.fabianoLuiz3103.exercicios.lista04linkedList.exercicio01;

import br.com.fabianoLuiz3103.exercicios.lista01.exercicio01.Vetor;

import java.util.Arrays;
import java.util.LinkedList;

public class TesteEx01 {

    public static void main(String[] args) {

        ListaEncadeada<String> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adiciona("A");
        listaEncadeada.adiciona("B");
        listaEncadeada.adiciona("C");
        listaEncadeada.adiciona("D");
        listaEncadeada.adiciona("E");

        System.out.println(Arrays.toString(listaEncadeada.toArray()));

    }
}
