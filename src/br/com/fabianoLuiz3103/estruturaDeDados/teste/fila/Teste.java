package br.com.fabianoLuiz3103.estruturaDeDados.teste.fila;

import br.com.fabianoLuiz3103.estruturaDeDados.fila.Fila;

public class Teste {

    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();

        fila.adiciona("A");
        fila.adiciona("B");
        fila.adiciona("C");
        fila.adiciona("D");
        System.out.println(fila);
        System.out.println(fila.primeiroDaFila());
        System.out.println(fila.ultimoDaFila());
        System.out.println(fila.isEmpty());

        System.out.println("Elemento removido da fila: " + fila.remove());
        System.out.println(fila);
        System.out.println(fila.primeiroDaFila());
        System.out.println(fila.ultimoDaFila());

    }
}
